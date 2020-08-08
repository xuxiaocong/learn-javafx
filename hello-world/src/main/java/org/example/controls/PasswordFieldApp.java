package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 密码文本框 PasswordField
 */
public class PasswordFieldApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password666");

        BorderPane root = new BorderPane();
        root.setTop(passwordField);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
