package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * 测试使用加载本地html
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 创建一个网络容器
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

//        // 有三种加载html的方式(直接取消注释即可)
//        // 1.加载在线站点
//        engine.load("http://www.damengsanqian.com/");

//        // 2.加载 HTML 字符串
//        engine.loadContent("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>Title</title></head><body><h1>这里是HTML页面String</h1></body></html>");

        // 3.加载本地 HTML 文件, 注意文件目录，注意与调用路径一致
        String url = getClass().getResource("index.html").toExternalForm();
        engine.load(url);


        var scene = new Scene(webView, 640, 480);
        stage.setTitle("测试HTML");
        stage.setScene(scene);
        stage.show();
    }
}