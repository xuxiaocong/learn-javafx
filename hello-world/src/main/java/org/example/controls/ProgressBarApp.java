package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 进度条 ProgressBar
 */
public class ProgressBarApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 进度条
        ProgressBar bar = new ProgressBar();
        // 进度指示器
        ProgressIndicator pi = new ProgressIndicator();
        // 进度为小数
        bar.setProgress(0.67F);
        pi.setProgress(0.67F);

        GridPane root = new GridPane();
        root.add(bar, 0, 0);
        root.add(pi, 0, 1);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
