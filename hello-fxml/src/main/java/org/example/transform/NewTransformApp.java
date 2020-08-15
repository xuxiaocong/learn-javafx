package org.example.transform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewTransformApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        // 加载视图文件
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newtransform.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("fxml窗体-深入理解fxml");
        stage.setScene(scene);
        stage.show();
    }
}
