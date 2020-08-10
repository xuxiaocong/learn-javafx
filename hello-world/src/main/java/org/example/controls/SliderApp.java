package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 滑竿 Slider
 */
public class SliderApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 第一个参数最小值，第二个参数为最大值，第三个参数为当前值
        Slider slider = new Slider(1, 10, 6);
        // 设置刻度
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(1);
        slider.setBlockIncrement(0.5f);

        Scene scene = new Scene(new StackPane(slider), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
