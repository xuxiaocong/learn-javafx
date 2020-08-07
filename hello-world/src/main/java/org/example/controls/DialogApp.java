package org.example.controls;

import javafx.application.Application;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;

/**
 * 对话框 Dialog
 */
public class DialogApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 增加按钮
        ButtonType btn = new ButtonType("The Button", ButtonBar.ButtonData.OK_DONE);
        // 对话框
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("这是对话框");
        dialog.setContentText("内容内容");
        dialog.getDialogPane().getButtonTypes().add(btn);
        dialog.showAndWait();
    }
}
