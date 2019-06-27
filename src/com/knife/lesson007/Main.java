package com.knife.lesson007;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HostServices hostServices = getHostServices();
        hostServices.showDocument("www.baidu.com");

        URL url = getClass().getClassLoader().getResource("com/knife/icons/icon.png");
        String path = url.toExternalForm();
        Button button = new Button("按钮");
        button.setPrefWidth(200);
        button.setPrefHeight(200);
        button.setCursor(Cursor.MOVE);
        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group);

        scene.setCursor(Cursor.cursor(path));
        primaryStage.setScene(scene);
        primaryStage.setTitle("javafx");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
