package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ToggleButtonApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 切换按钮
        ToggleButton tb1 = new ToggleButton("切换按钮 1");
        ToggleButton tb2 = new ToggleButton("切换按钮 2");
        ToggleButton tb3 = new ToggleButton("切换按钮 3");
        // 添加组，仅表示切换，不表示定位
        ToggleGroup group = new ToggleGroup();
        tb1.setToggleGroup(group);
        tb2.setToggleGroup(group);
        tb3.setToggleGroup(group);
        // 添加到面板中
        GridPane grid = new GridPane();
        grid.add(tb1, 0, 1);
        grid.add(tb2, 0, 2);
        grid.add(tb3, 0, 3);

        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();

    }
}
