package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 树结构 TreeItem
 */
public class TreeApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        TreeItem<String> root = new TreeItem<>("根节点");
        root.setExpanded(true);
        root.getChildren().addAll(
                new TreeItem<>("选项一"),
                new TreeItem<>("选项二"),
                new TreeItem<>("选项三")
        );
        TreeView<String> treeView=new TreeView<>(root);

        Scene scene=new Scene(new StackPane(treeView),320,240);
        stage.setScene(scene);
        stage.show();
    }
}
