package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 单选按钮 RadioButton
 */
public class RadioButtonApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage)  {
        // 单选按钮
        RadioButton btn1=new RadioButton("选项 1");
        RadioButton btn2=new RadioButton("选项 2");
        RadioButton btn3=new RadioButton("选项 3");
        // 该分组仅为切换分组，即值的切换，并不代表界面中的定位
        ToggleGroup group=new ToggleGroup();
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);
        // 将“选项 3”设置为默认选中
        btn3.setSelected(true);
        // 单选按钮的定位，以GridPane举例
        GridPane root = new GridPane();
        root.add(btn1, 0, 0);
        root.add(btn2, 0, 1);
        root.add(btn3, 0, 2);


        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
