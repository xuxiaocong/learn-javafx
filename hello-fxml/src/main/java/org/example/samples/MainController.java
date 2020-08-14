package org.example.samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Main控制器
 */
public class MainController implements Initializable {
    /**
     * 使用 @FXML 标记，才能够与fxml绑定
     * 使用 public 修饰符，否则会报错
     * 这里是个菜单
     */
    @FXML
    public MenuBar menuBar;

    @FXML
    public Button btn_1;

    /**
     * Override 了 Initializable接口，该接口在实例化之后调用
     */
    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // btn_1 使用 @FXML注解会创建按钮，不需要再使用new关键字
        btn_1.setOnAction(e -> {
            btn_1.setText("修改按钮文本");
        });

        // 菜单在fxml已使用fx:id关键字绑定
        // fxml中标签已经添加到了菜单
        // 这里添加菜单会添加到fxml创建的菜单之后
        Menu file_menu = new Menu("Controller创建的菜单");
        file_menu.getItems().addAll(new MenuItem("菜单项 2"), new MenuItem("菜单项 3"));
        menuBar.getMenus().add(file_menu);

    }

    /**
     * 添加事件，在fxml使用 onAction="#方法名" 绑定
     */
    @FXML
    public void handleButtonTwoAction(ActionEvent event) {
        Button btn = (Button) event.getTarget();
        btn.setText("登登登登");
    }
}
