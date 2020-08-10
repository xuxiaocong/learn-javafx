package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * SplitMenuButton
 */
public class SplitMenuButtonApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        SplitMenuButton btn = new SplitMenuButton();
        btn.setText("菜单按钮");
        btn.getItems().addAll(new MenuItem("菜单项 1"), new MenuItem("菜单项 2"));

        Scene scene = new Scene(new StackPane(btn), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
