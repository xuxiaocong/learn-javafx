package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 组合框 ComboBox
 */
public class ComboBoxApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 组合框
        ComboBox<Rectangle> cmb = new ComboBox<>();
        // 添加选项
        cmb.getItems().addAll(
                new Rectangle(10, 10, Color.RED),
                new Rectangle(10, 10, Color.GREEN),
                new Rectangle(10, 10, Color.BLUE)
        );

        GridPane grid = new GridPane();
        grid.add(cmb, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
