package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 菜单分割符 SeparatorMenu
 */
public class SeparatorMenuApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        MenuItem item1 = new MenuItem("菜单项 1");
        MenuItem item2 = new MenuItem("菜单项 2");
        MenuItem item3 = new MenuItem("菜单项 3");
        SeparatorMenuItem separator = new SeparatorMenuItem();

        Menu menu = new Menu("菜单");
        menu.getItems().addAll(item1, item2, separator, item3);
        MenuBar bar = new MenuBar(menu);

        BorderPane root = new BorderPane();
        root.setTop(bar);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
