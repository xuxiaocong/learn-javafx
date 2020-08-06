package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 复选框树 CheckBoxTree
 */
public class CheckBoxTreeApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 选项
        CheckBoxTreeItem<String> aliItem = new CheckBoxTreeItem<>("阿里巴巴");
        CheckBoxTreeItem<String> qqItem = new CheckBoxTreeItem<>("腾讯");
        CheckBoxTreeItem<String> baiduItem = new CheckBoxTreeItem<>("百度");
        CheckBoxTreeItem<String> netItem = new CheckBoxTreeItem<>("互联网企业");
        // 设置父子级
        netItem.setExpanded(true);
        netItem.getChildren().addAll(aliItem, qqItem, baiduItem);
        // 设置根节点
        final TreeView<String> treeView = new TreeView<>();
        treeView.setRoot(netItem);
        treeView.setCellFactory(CheckBoxTreeCell.forTreeView());
        // 点击事件
        aliItem.addEventHandler(CheckBoxTreeItem.checkBoxSelectionChangedEvent(), (event) ->
                System.out.println("是否选择阿里巴巴：" + event.getTreeItem().isSelected())
        );

        Scene scene = new Scene(new StackPane(treeView), 320, 240);
        stage.setTitle("CheckBoxTree Control");
        stage.setScene(scene);
        stage.show();
    }
}
