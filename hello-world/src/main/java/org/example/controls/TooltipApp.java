package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 提示 Tooltip
 */
public class TooltipApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("鼠标悬浮这里几秒钟");
        button.setTooltip(new Tooltip("这是一个提示信息"));

        Scene scene = new Scene(new StackPane(button), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
