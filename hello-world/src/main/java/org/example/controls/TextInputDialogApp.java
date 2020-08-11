package org.example.controls;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * 文本弹窗 TextInputDialog
 */
public class TextInputDialogApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 初始文本
        TextInputDialog dialog = new TextInputDialog("什么鬼");
        dialog.show();
    }
}
