package com.knife.lesson009;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button();
        b1.setText("这是按钮!");
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.setPrefHeight(200);
        b1.setPrefWidth(400);
        b1.setFont(Font.font("sans-serif",40));

        BackgroundFill bgf = new BackgroundFill(Paint.valueOf("#8FBC8F"),new CornerRadii(20),new Insets(10));
        Background bg = new Background(bgf);
        BorderStroke bos  = new BorderStroke(Paint.valueOf("#8A2BE2"),BorderStrokeStyle.SOLID,new CornerRadii(20),new BorderWidths(5));
        Border border = new Border(bos);
        b1.setBorder(border);
        b1.setBackground(bg);

        b1.setOnAction(event -> {
            Button button =(Button) event.getSource();

            System.out.println("javafx:"+button.getText());
        });

        Group root = new Group();
        root.getChildren().add(b1);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("javafx");
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
