package br.com.example.spark.json;

import br.com.example.model.Mock;
import br.com.example.transformer.JsonTransformer;
import spark.Route;
import spark.Spark;

/**
 * Created by rondy on 25/12/2016.
 */
public class SparkJsonRequest {

    private JsonTransformer jsonTransformer = new JsonTransformer();
    private Route route;
    private Mock mock;

    public SparkJsonRequest(Mock mock, Route route) {
        this.mock = mock;
        this.route = route;

        createRequests();

    }

    private void createRequests() {
        String path = mock.getPath();
        switch (mock.getHttpMethod()) {
            case get:
                Spark.get(path, route, jsonTransformer);
                break;
            case post:
                Spark.post(path, route, jsonTransformer);
                break;
            case patch:
                Spark.patch(path, route, jsonTransformer);
                break;
            case delete:
                Spark.delete(path, route, jsonTransformer);
                break;
            case head:
                Spark.head(path, route, jsonTransformer);
                break;
            case trace:
                Spark.trace(path, route, jsonTransformer);
                break;
            case connect:
                Spark.connect(path, route, jsonTransformer);
                break;
            case options:
                Spark.options(path, route, jsonTransformer);
                break;
        }
    }
}
