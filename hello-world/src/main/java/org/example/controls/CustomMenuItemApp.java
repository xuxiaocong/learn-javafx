package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 自定义菜单 CustomMenuItem
 */
public class CustomMenuItemApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 自定义菜单项
        CustomMenuItem menuItem = new CustomMenuItem(new Slider());
        menuItem.setHideOnClick(false);
        // 添加到菜单
        Menu menu = new Menu("Brightness");
        menu.getItems().add(menuItem);
        MenuBar bar = new MenuBar(menu);

        BorderPane root=new BorderPane();
        root.setTop(bar);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
