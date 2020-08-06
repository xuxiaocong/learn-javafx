package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 选择框 ChoiceBox
 */
public class ChoiceBoxApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 字符串选择框
        ChoiceBox<String> box = new ChoiceBox<>();
        // 添加选项
        box.getItems().addAll("item 1", "item 2", "item 3");
        // 选择事件
        box.setOnAction((e) -> System.out.println(box.getValue()));

        Scene scene = new Scene(new StackPane(box), 320, 240);
        stage.setTitle("ChoiceBox Control");
        stage.setScene(scene);
        stage.show();
    }
}
