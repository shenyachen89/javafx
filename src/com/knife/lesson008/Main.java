package com.knife.lesson008;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    int i = 10;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");

        Group group = new Group();

//        group.getChildren().add(b1);
//        group.getChildren().add(b2);
//        group.getChildren().add(b3);

        b1.setLayoutX(0);
        b1.setLayoutY(10);
        b1.setPrefWidth(50);
        b1.setPrefHeight(50);

        b2.setLayoutX(200);
        b2.setLayoutY(10);
        b2.setPrefWidth(50);
        b2.setPrefHeight(50);

        b3.setLayoutX(400);
        b3.setLayoutY(10);
        b3.setPrefWidth(50);
        b3.setPrefHeight(50);


        group.getChildren().addAll(b1, b2, b3);
//        group.setAutoSizeChildren(false);
//        group.getChildren().clear();

//        group.setOpacity(0.5);

        group.getChildren().addListener((ListChangeListener<? super Node>) a -> {
            System.out.println("当前子组件数量=" + a.getList().size());
        });


        System.out.println(group.contains(0, 10));

        Object[] obj = group.getChildren().toArray();
        System.out.println(obj.length);

        for (Object o : obj) {
            Button bu = (Button) o;
            bu.setPrefWidth(100);
            bu.setPrefHeight(100);
        }

        b1.setOnAction(event -> {
            i = i + 10;
            Button b4 = new Button("b4");
            b4.setLayoutX(600);
            b4.setLayoutY(i);
            group.getChildren().add(b4);
        });

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("javafx");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}

