package org.example.transform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 转换窗体
 */
public class TransformApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        // 加载视图文件
        FXMLLoader loader = new FXMLLoader(getClass().getResource("transform.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("fxml窗体");
        stage.setScene(scene);
        stage.show();
    }
}
