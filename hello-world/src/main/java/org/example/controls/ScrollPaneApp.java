package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 滚动面板 ScrollPane
 */
public class ScrollPaneApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 长方形
        Rectangle rect = new Rectangle(200, 200, Color.BLUE);
        // 滚动面板
        ScrollPane pane = new ScrollPane(rect);
        // 设置大小，尺寸比内容小，就会显示滚动条
        pane.setPrefSize(150, 150);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
