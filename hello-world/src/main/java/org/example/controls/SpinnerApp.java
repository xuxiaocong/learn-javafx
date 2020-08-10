package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 微调器（步进器） Spinner
 */
public class SpinnerApp extends Application {
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) {
        Spinner spinner = new Spinner(0, 10, 5);

        Scene scene = new Scene(new StackPane(spinner), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
