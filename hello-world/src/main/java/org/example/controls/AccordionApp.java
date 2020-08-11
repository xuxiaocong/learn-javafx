package org.example.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * 手风琴 Accordion
 */
public class AccordionApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        TitledPane t1 = new TitledPane("T1", new Button("Button1"));
        TitledPane t2 = new TitledPane("T2", new Button("Button2"));
        TitledPane t3 = new TitledPane("T3", new Button("Button3"));
        // 仅表示只有一个能展开
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2, t3);

        var scene = new Scene(accordion, 320, 240);
        stage.setTitle("Accordion Control");
        stage.setScene(scene);
        stage.show();

    }
}
