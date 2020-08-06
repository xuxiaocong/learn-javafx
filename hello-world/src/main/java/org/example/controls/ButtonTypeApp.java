package org.example.controls;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * 按钮类型 ButtonType
 */
public class ButtonTypeApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // OK按钮类型
        ButtonType bt = new ButtonType("ButtonType Control", ButtonBar.ButtonData.OK_DONE);
        // 添加到 Alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "ButtonType Control", bt);
        alert.show();
    }
}
