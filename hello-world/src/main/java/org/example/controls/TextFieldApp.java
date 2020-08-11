package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 文本框 TextField
 */
public class TextFieldApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField("文本框");

        Scene scene = new Scene(new StackPane(textField), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
