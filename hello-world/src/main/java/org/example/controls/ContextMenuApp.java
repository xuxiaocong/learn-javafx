package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * ContextMenu
 */
public class ContextMenuApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 创建菜单并添加菜单项
        ContextMenu menu = new ContextMenu();
        MenuItem item1 = new MenuItem("About");
        MenuItem item2 = new MenuItem("Preferences");
        menu.getItems().addAll(item1, item2);
        // 添加菜单 ，注意：这控件属于弹出窗，点击右键显示
        TextField field = new TextField("Type Something");
        field.setContextMenu(menu);

        Scene scene = new Scene(new StackPane(field), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
