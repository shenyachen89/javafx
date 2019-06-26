package com.knife.lesson005;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start方法里面的线程名字：" + Thread.currentThread().getName());
        Platform.runLater(() -> {
            System.out.println("run方法里面的线程名字：" + Thread.currentThread().getName());
            int i = 1;
            while (i <= 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i = " + i);
                i = i + 1;
            }
        });
        System.out.println("runLater()下面");
    }
}
