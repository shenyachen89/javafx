package com.knife.lesson001;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("这是第一个javafx程序");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
