package org.example.controls;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SeparatorApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 标签
        Label l1 = new Label("标签 1");
        Label l2 = new Label("标签 2");
        Label l3 = new Label("标签 3");
        // 水平分割线
        Separator separator = new Separator(Orientation.HORIZONTAL);
        // 在“标签 1”和“标签 2”之间加分割线
        VBox box = new VBox(l1, separator, l2, l3);

        Scene scene = new Scene(box, 150, 150);
        stage.setScene(scene);
        stage.show();
    }
}
