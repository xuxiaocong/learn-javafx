package org.example.transform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class NewTransformController implements Initializable {
    // 绑定菜单栏对象
    @FXML
    public MenuBar menuBar;

    @FXML
    public TextField textField;

    @FXML
    public Label label;

    @FXML
    public Button button;

    @FXML
    public void hanldeButtonAction(ActionEvent event) {
        label.setText("文本框输入内容为:" + textField.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // 再创建一个菜单
        Menu otherMenu = new Menu("controller添加的菜单");
        MenuItem addMenuItem = new MenuItem("菜单项");
        otherMenu.getItems().addAll(addMenuItem);
        // 将创建的菜单添加到菜单栏中
        menuBar.getMenus().addAll(otherMenu);

        // 重新设置文本内容
        textField.setText("Controller重新设置内容");
    }
}
