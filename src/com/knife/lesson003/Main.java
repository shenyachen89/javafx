package com.knife.lesson003;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX");
        primaryStage.getIcons().add(new Image("com/knife/icons/icon.png"));
//        primaryStage.setIconified(true);//设置最小化
//        primaryStage.setMaximized(true);//设置最大化
//        primaryStage.close();//关闭窗口
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
//        primaryStage.setResizable(false);//设置不可改变窗口大小
//        primaryStage.setMaxWidth(800);
//        primaryStage.setMaxHeight(800);
//        primaryStage.setMinWidth(300);
//        primaryStage.setMinHeight(300);
//        System.out.println("宽度："+primaryStage.getWidth());
//        System.out.println("高度："+primaryStage.getHeight());
        primaryStage.heightProperty().addListener((a,b,c)->{
            System.out.println("当前高度："+c.doubleValue());
        });

        primaryStage.widthProperty().addListener((a,b,c)->{
            System.out.println("当前宽度："+c.doubleValue());
        });

        primaryStage.setFullScreen(true);//设置全屏
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.show();
    }
}
