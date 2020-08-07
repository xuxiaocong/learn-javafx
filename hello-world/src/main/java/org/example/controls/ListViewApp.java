package org.example.controls;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 列表 ListView
 */
public class ListViewApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        ObservableList<String> holidays = FXCollections.observableArrayList(
                "[01-01] 元旦", "[02-14] 情人节",
                "[03-15] 消费者", "[05-01] 劳动节");
        ListView<String> listView = new ListView<>(holidays);

        GridPane grid = new GridPane();
        grid.add(listView, 0, 0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setScene(scene);
        stage.show();

    }
}
