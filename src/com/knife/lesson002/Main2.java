package com.knife.lesson002;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static void main(String[] args) {
        Application.launch(Main2.class,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("这是start方法");
    }
}
