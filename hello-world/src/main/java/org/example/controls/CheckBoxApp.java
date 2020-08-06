package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 复选框 CheckBox
 */
public class CheckBoxApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 勾选
        CheckBox box1 = new CheckBox("复选框，默认勾选");
        box1.setSelected(true);
        // 不勾选
        CheckBox box2 = new CheckBox("复选框，默认不勾选");
        box2.setSelected(false);
        // 待定
        CheckBox box3 = new CheckBox("复选框，待定");
        box3.setAllowIndeterminate(true);
        box3.setIndeterminate(true);

        GridPane grid = new GridPane();
        grid.add(box1, 0, 0);
        grid.add(box2, 0, 1);
        grid.add(box3, 0, 2);
        var scene = new Scene(grid, 320, 240);
        stage.setTitle("CheckBox Control");
        stage.setScene(scene);
        stage.show();
    }
}
