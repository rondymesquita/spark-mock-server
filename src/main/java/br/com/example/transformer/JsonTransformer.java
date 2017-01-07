package br.com.example.transformer;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by alvarosilva on 22/12/16.
 */
public class JsonTransformer implements ResponseTransformer{

    private Gson gson = new Gson();

    public String render(Object model) throws Exception {
        return gson.toJson(model);
    }

}
