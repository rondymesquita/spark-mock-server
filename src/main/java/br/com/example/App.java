package br.com.example;
//import static spark.Spark.*;
//import spark.Spark;

import spark.Spark;

/**
 * Hello world!
 */
public class App {
    private Config config;
    private Controller controller;

    public App() {
        config = new Config();
        controller = new Controller();
        config.postConfig();
    }

    public void stop(){
        Spark.stop();
    }

    public Config getConfig(){
        return config;
    }
}
