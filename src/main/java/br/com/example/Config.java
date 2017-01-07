package br.com.example;

import spark.Spark;

/**
 * Created by alvarosilva on 19/12/16.
 */
public class Config {

    private final int PORT = 9090;

    public Config(){
        Spark.port(PORT);
    }

    public void postConfig() {
        Spark.awaitInitialization();
    }

    public int getPort(){
        return PORT;
    }
}
