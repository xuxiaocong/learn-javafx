package org.example;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 * 增加监听事件
 */
public class MemberApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        String url = getClass().getResource("member.html").toExternalForm();
        engine.load(url);
        this.addWebEngineListener(engine);

        Scene scene = new Scene(webView, 640, 480);
        stage.setTitle("测试Java代码监听html事件");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * 添加监听，加载web后回调，添加监听事件
     *
     * @param engine web引擎
     */
    private void addWebEngineListener(WebEngine engine) {
        engine.getLoadWorker().stateProperty().addListener(
                (ov, oldState, newState) -> {
                    if (newState == Worker.State.SUCCEEDED) {
                        // 自定义的Java对象，里面有方法
                        JavaAction javaAction = new JavaAction();
                        // 将对象注入到dom之中，（需要在module-info.java添加jdk.jsobject模块）
                        JSObject window = (JSObject) engine.executeScript("window");
                        window.setMember("app", javaAction);
                    }
                }
        );
    }
}
