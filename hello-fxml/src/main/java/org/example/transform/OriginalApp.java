package org.example.transform;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 原始App，即完全用代码写界面
 */
public class OriginalApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 创建 “文件”菜单
        Menu firstMenu = new Menu("文件");
        MenuItem newMenuItem = new MenuItem("新建...");
        MenuItem openMenuItem = new MenuItem("打开...");
        firstMenu.getItems().addAll(newMenuItem, openMenuItem);
        // 创建 “帮助”菜单
        Menu secondMenu = new Menu("帮助");
        MenuItem aboutMenuItem = new MenuItem("关于我们");
        secondMenu.getItems().add(aboutMenuItem);
        // 创建菜单栏
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(firstMenu, secondMenu);

        // 主要区域： 1个输入框，1个按钮，一个显示区域
        VBox box = new VBox();
        box.setSpacing(20);
        TextField textField = new TextField("看看");
        Label label = new Label("文本框输入内容为:");
        Button button = new Button("点击");
        button.setOnAction(e -> label.setText("文本框输入内容为:" + textField.getText()));
        box.getChildren().addAll(textField, button, label);

        // Border面板
        BorderPane pane = new BorderPane();
        pane.setTop(menuBar);
        pane.setCenter(box);
        pane.setPrefWidth(320);
        pane.setPrefHeight(240);

        Scene scene = new Scene(pane);
        stage.setTitle("初始（纯代码）窗体");
        stage.setScene(scene);
        stage.show();
    }
}
