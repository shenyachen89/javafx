package com.knife.lesson004;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setOpacity(0.5);//设置窗口透明度（0到1）
//        primaryStage.setAlwaysOnTop(true);//设置置顶
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        primaryStage.setX(500);
        primaryStage.setY(500);
        primaryStage.xProperty().addListener((a,b,c)->{
            System.out.println("窗口X坐标:"+c.doubleValue());
        });
        primaryStage.yProperty().addListener((a,b,c)->{
            System.out.println("窗口Y坐标:"+c.doubleValue());
        });
        primaryStage.show();
    }
}
