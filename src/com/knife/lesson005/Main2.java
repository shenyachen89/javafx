package com.knife.lesson005;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Platform.setImplicitExit(false);

        System.out.println(Platform.isSupported(ConditionalFeature.SCENE3D));

        System.out.println(Platform.isSupported(ConditionalFeature.FXML));
        primaryStage.show();
//        Platform.exit();
    }
}
