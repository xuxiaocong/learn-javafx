package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 分割面板 SplitPane
 */
public class SplitPaneApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 子容器
        StackPane sp1 = new StackPane(new Button("btn 1"));
        StackPane sp2 = new StackPane(new Button("btn 2"));
        StackPane sp3 = new StackPane(new Button("btn 3"));
        // 分割布局
        SplitPane pane = new SplitPane();
        pane.getItems().addAll(sp1, sp2, sp3);
        // 设置分割比例
        pane.setDividerPositions(0.3f, 0.5f, 0.2f);

        Scene scene=new Scene(pane,320,240);
        stage.setScene(scene);
        stage.show();
    }
}
