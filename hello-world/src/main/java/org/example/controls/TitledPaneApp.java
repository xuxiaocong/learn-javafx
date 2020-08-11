package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * 折叠面板 TitledPane
 */
public class TitledPaneApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        TitledPane pane = new TitledPane("Titled 1", new Button("Button 1"));

        Scene scene = new Scene(pane, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
