package br.com.example.model;

import spark.route.HttpMethod;

/**
 * Created by alvarosilva on 22/12/16.
 */
public class Mock {
    private String path;
    private HttpMethod httpMethod;
    private Response response;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Mock{" +
                "path='" + path + '\'' +
                ", httpMethod=" + httpMethod +
                ", response=" + response +
                '}';
    }
}
