package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 菜单 Menu
 */
public class MenuApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 菜单 1
        Menu file_menu = new Menu("File");
        file_menu.getItems().addAll(new MenuItem("New"), new MenuItem("Open"));
        // 菜单 2
        Menu help_menu = new Menu("Help");
        help_menu.getItems().addAll(new MenuItem("About"), new MenuItem("Exit"));

        MenuBar bar = new MenuBar(file_menu, help_menu);

        BorderPane root = new BorderPane();
        root.setTop(bar);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
