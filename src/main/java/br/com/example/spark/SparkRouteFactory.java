package br.com.example.spark;

import br.com.example.model.Mock;
import br.com.example.spark.json.SparkJsonRequest;
import br.com.example.spark.json.SparkRouteJsonImpl;

/**
 * Created by rondy on 25/12/2016.
 */
public class SparkRouteFactory {

    public static void buildFrom(Mock mock) {
        if (mock.getResponse().getType().equals("json")) {
            SparkRouteJsonImpl route = new SparkRouteJsonImpl(mock);
            new SparkJsonRequest(mock, route);
        }
    }
}
