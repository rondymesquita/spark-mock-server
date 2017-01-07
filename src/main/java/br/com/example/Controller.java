package br.com.example;

import br.com.example.model.Mock;
import br.com.example.model.ResponseData;
import br.com.example.spark.SparkRouteFactory;
import br.com.example.transformer.JsonTransformer;
import br.com.example.util.Constants;
import com.google.gson.Gson;
import spark.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alvarosilva on 19/12/16.
 */
public class Controller {

    private ResponseTransformer responseTransformer = new JsonTransformer();
    private Gson gson = new Gson();
    private List<String> pathList = new ArrayList<String>();

    public Controller() {

        Spark.post("/create", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                Mock mock = gson.fromJson(request.body(), Mock.class);
                SparkRouteFactory.buildFrom(mock);
                response.type("application/json");
                return new ResponseData(Constants.ROUTE_CREATED, ResponseData.SUCCESS);
            }
        }, responseTransformer);

        Spark.exception(Exception.class, new ExceptionHandler(){
            public void handle(Exception exception, Request request, Response response) {
                exception.printStackTrace();
            }
        });
    }

}
