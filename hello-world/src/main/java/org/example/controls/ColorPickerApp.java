package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 取色器 ColorPicker
 */
public class ColorPickerApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 取色器
        ColorPicker picker = new ColorPicker();
        // 获取颜色后的 RGB
        picker.setOnAction(e -> {
            Color color = picker.getValue();
            System.out.println("获取到的颜色RGB=(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")");
        });

        GridPane grid = new GridPane();
        grid.add(picker, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
