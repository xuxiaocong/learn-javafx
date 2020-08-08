package org.example.controls;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 滚动条 ScrollBar
 */
public class ScrollBarApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        ScrollBar bar = new ScrollBar();
        // 垂直滚动条
        bar.setOrientation(Orientation.VERTICAL);

        BorderPane root = new BorderPane();
        root.setRight(bar);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
