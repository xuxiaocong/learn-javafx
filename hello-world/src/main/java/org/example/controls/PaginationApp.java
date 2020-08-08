package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 分页 Pagination
 */
public class PaginationApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 页码，第一个参数是总页数，第二个参数是初始页面Index（从0开始）
        Pagination pagination = new Pagination(5, 1);
        pagination.setPageFactory(pageIndex -> new Label("这是第" + pageIndex + "页的内容"));

        BorderPane root = new BorderPane();
        root.setBottom(pagination);
        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
