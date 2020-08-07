package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 标签 Label
 */
public class LabelApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Label label = new Label("标签 Label");

        GridPane grid = new GridPane();
        grid.add(label, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
