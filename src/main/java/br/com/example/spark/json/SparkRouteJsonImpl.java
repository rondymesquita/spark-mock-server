package br.com.example.spark.json;

import br.com.example.model.Mock;
import br.com.example.transformer.JsonTransformer;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Created by rondy on 25/12/2016.
 */
public class SparkRouteJsonImpl implements Route{

    private Mock mock;

    public SparkRouteJsonImpl(Mock mock){
        this.mock = mock;
    }

    public Object handle(Request request, Response response) throws Exception {
        response.type("application/json");
        return mock.getResponse().getData();
    }
}
