package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 单选菜单 RadioMenu
 */
public class RadioMenuApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 单选菜单
        RadioMenuItem item1 = new RadioMenuItem("选项 1");
        RadioMenuItem item2 = new RadioMenuItem("选项 2");
        RadioMenuItem item3 = new RadioMenuItem("选项 3");
        // 单选菜单编组
        ToggleGroup group = new ToggleGroup();
        item1.setToggleGroup(group);
        item2.setToggleGroup(group);
        item3.setToggleGroup(group);
        // 默认选中“选项 3”
        item3.setSelected(true);
        // 设置到菜单中
        Menu menu = new Menu("选择");
        menu.getItems().addAll(item1, item2, item3);
        MenuBar bar = new MenuBar(menu);

        BorderPane root = new BorderPane();
        root.setTop(bar);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
