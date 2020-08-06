package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 * 复选框菜单 CheckMenu
 */
public class CheckMenuApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 复选框菜单
        CheckMenuItem cItem = new CheckMenuItem("Enabled");
        // 添加点击事件
        cItem.setOnAction(e -> {
            CheckMenuItem eItem = (CheckMenuItem) e.getTarget();
            System.out.println("勾选:" + eItem.isSelected());
        });
        // 添加到菜单中
        Menu menu = new Menu("The Menu");
        menu.getItems().add(cItem);
        MenuBar bar = new MenuBar(menu);

        Scene scene = new Scene(new TilePane(bar), 320, 240);
        stage.setTitle("CheckMenu Control");
        stage.setScene(scene);
        stage.show();
    }
}
