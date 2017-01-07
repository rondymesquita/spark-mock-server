package br.com.example;

import br.com.example.model.Mock;
import br.com.example.model.Response;
import br.com.example.model.ResponseType;
import spark.route.HttpMethod;

/**
 * Created by rondy on 25/12/2016.
 */
public class MockHelper {

    /*
    {
        "path":"/json-get",
        "httpMethod":"get",
        "response":{
            "type":"json",
            "data":{
                "id":"1",
                "email":"email@email.com"
            }
        }
    }
     */

    public Mock buildBasicJsonGet() {
        Mock mock = new Mock();
        mock.setPath("/json-get");
        mock.setHttpMethod(HttpMethod.get);
        Response response = new Response();
        response.setType(ResponseType.json);
        response.setData("{\"id\":\"1\",\"email\":\"email@email.com\"}");
        mock.setResponse(response);
        return mock;
    }
}
