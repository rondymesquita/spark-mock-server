package br.com.example;


import br.com.example.model.Mock;
import br.com.example.model.ResponseData;
import br.com.example.util.Constants;
import com.google.gson.Gson;
import com.vtence.molecule.testing.http.HttpRequest;
import com.vtence.molecule.testing.http.HttpResponse;
import com.vtence.molecule.testing.http.HttpResponseAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AppTest {

    private App app;
    private int port = app.getConfig().getPort();

    @Before
    public void before(){
        app = new App();
    }

    @After
    public void after(){
        app.stop();
    }

    @Test
    public void shouldCreateRouteShouldExists() throws IOException {
        HttpRequest request = new HttpRequest(port);
        Mock mock = new MockHelper().buildBasicJsonGet();
        request.body(new Gson().toJson(mock));
        HttpResponse response = request.post("/create");

        HttpResponseAssert responseAssert = new HttpResponseAssert(response);
        responseAssert
                .isOK();
    }

    @Test
    public void shouldCreateAGetMockRouteWithJsonReturn() throws IOException {
        HttpRequest request = new HttpRequest(port);
        Mock mock = new MockHelper().buildBasicJsonGet();
        request.body(new Gson().toJson(mock));

        HttpRequest jsonGetRequest = new HttpRequest(port);
        HttpResponse jsonGetResponse = jsonGetRequest.get("/json-get");
        assertEquals(404, jsonGetResponse.statusCode());

        HttpResponse response = request.post("/create");
        ResponseData responseData = new ResponseData(Constants.ROUTE_CREATED, ResponseData.SUCCESS);
        assertEquals(200, response.statusCode());
        assertEquals(new Gson().toJson(responseData), response.bodyText());
    }

}
