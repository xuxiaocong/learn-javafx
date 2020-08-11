package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 文本区 TextArea
 */
public class TextAreaApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        String text = "Text input component that allows a user to enter multiple lines of plain text. "
                + "Unlike in previous releases of JavaFX, support for single line input is not available "
                + "as part of the TextArea control, however this is the sole-purpose of the TextField control. "
                + "Additionally, if you want a form of rich-text editing, there is also the HTMLEditor control.";
        TextArea textArea = new TextArea(text);
        // 自动换行
        textArea.setWrapText(true);

        Scene scene = new Scene(new StackPane(textArea), 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}
