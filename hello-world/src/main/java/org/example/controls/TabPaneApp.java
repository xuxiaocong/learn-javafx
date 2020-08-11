package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 标签面板 TabPanel
 */
public class TabPaneApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // Tab面板
        TabPane pane = new TabPane();
        // Tab页
        Tab tab_1 = new Tab("第一页");
        Tab tab_2 = new Tab("第二页");
        // 第二个Tab页添加一个蓝色长方形，以示区分
        tab_2.setContent(new Rectangle(100, 50, Color.LIGHTBLUE));
        pane.getTabs().addAll(tab_1, tab_2);

        Scene scene = new Scene(pane, 320, 240);
        stage.setScene(scene);
        stage.show();


    }
}
