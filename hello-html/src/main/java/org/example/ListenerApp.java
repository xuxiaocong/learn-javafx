package org.example;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.events.EventTarget;

/**
 * 增加监听事件
 */
public class ListenerApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        String url = getClass().getResource("listener.html").toExternalForm();
        engine.load(url);
        this.addWebEngineListener(engine);

        Scene scene = new Scene(webView, 640, 480);
        stage.setTitle("测试Java代码监听html事件");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * 添加监听，加载web后回调，添加监听事件
     * @param engine web引擎
     */
    private void addWebEngineListener(WebEngine engine) {
        engine.getLoadWorker().stateProperty().addListener(
                (ov, oldState, newState) -> {
                    if (newState == Worker.State.SUCCEEDED) {
                        // 获取html文件
                        Document doc = engine.getDocument();
                        // 根据id获取标签
                        Element el = doc.getElementById("btn");
                        // 添加点击事件
                        ((EventTarget) el).addEventListener("click", e -> System.out.println("点击了"), false);
                    }
                }
        );
    }
}
