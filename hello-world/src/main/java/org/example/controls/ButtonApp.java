package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 按钮 Button
 */
public class ButtonApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 简单按钮
        Button btn = new Button("Click me");
        btn.setOnAction((e) -> System.out.println(e.getTarget().toString()));

        // 带选型图案的按钮
        Circle circle = new Circle();
        circle.setRadius(8.0f);
        Button circleBtn = new Button("带圆形图案的按钮", circle);
        circleBtn.setOnAction((e) -> System.out.println(e.getTarget().toString()));

        GridPane grid = new GridPane();
        grid.add(btn, 0, 0);
        grid.add(circleBtn, 0, 1);
        var scene = new Scene(grid, 320, 240);
        stage.setTitle("Button Control");
        stage.setScene(scene);
        stage.show();
    }
}
