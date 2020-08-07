package org.example.controls;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

import java.util.List;

/**
 * 选择弹窗 ChoiceDialog
 */
public class ChoiceDialogApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 多个选项
        List<String> colors = List.of("Red", "Yellow", "Green");
        // 选择弹窗，默认"Yellow"
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Yellow", colors);
        dialog.showAndWait();
    }
}
