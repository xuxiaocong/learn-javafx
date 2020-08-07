package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 超链接 Hyperlink
 */
public class HyperlinkApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Hyperlink link = new Hyperlink("www.damengsanqian.com");

        GridPane grid = new GridPane();
        grid.add(link, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
