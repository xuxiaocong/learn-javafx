package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 菜单（按钮样式） MenuButton
 */
public class MenuButtonApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        MenuButton menu = new MenuButton("菜单");
        menu.getItems().addAll(new MenuItem("沙县"), new MenuItem("牛排"));

        BorderPane root = new BorderPane();
        root.setTop(menu);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
