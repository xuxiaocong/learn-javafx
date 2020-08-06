package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.stage.Stage;

/**
 * 按钮栏 ButtonBar
 */
public class ButtonBarApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        ButtonBar bar = new ButtonBar();
        // Yes 按钮
        Button yesButton = new Button("Yes");
        ButtonBar.setButtonData(yesButton, ButtonBar.ButtonData.YES);
        // No 按钮
        Button noButton = new Button("No");
        ButtonBar.setButtonData(noButton, ButtonBar.ButtonData.NO);
        // Cancel 按钮
        Button cancelButton = new Button("Cancel");
        ButtonBar.setButtonData(cancelButton, ButtonBar.ButtonData.CANCEL_CLOSE);

        bar.getButtons().addAll(yesButton, noButton, cancelButton);

        var scene = new Scene(bar, 320, 240);
        stage.setTitle("ButtonBar Control");
        stage.setScene(scene);
        stage.show();
    }
}
