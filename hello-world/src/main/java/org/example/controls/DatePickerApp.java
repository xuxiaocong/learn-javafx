package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 日期选择器 DatePicker
 */
public class DatePickerApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 添加日期选择器
        DatePicker picker = new DatePicker();
        picker.setOnAction(e -> System.out.println("Selected date:" + picker.getValue()));

        GridPane grid = new GridPane();
        grid.add(picker, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
