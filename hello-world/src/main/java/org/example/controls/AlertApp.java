package org.example.controls;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

/**
 * 弹窗 Alert
 */
public class AlertApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 实例 1
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Confirmation alert?");
        alert.setTitle("请确认Alert demo");
        // Option 1:传统方法
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            System.out.println("点击了ok");
        }
        // Option 2:传统 + 可选方法
        alert.showAndWait().ifPresent(System.out::println);
        // Option 3:lambda方法
        alert.showAndWait()
                .filter(response -> response == ButtonType.OK)
                .ifPresent(System.out::println);


        // 示例 2
        ButtonType okBtn = new ButtonType("自定义 - OK", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancelBtn = new ButtonType("自定义 - CANCEL", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION, "测试自定义按钮", okBtn, cancelBtn);
        alert2.showAndWait().ifPresent(System.out::println);

    }
}
