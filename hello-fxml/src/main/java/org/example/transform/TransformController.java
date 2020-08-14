package org.example.transform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * 转为fxml后的控制器
 */
public class TransformController implements Initializable {

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
        // 在窗体构建后，调用该方法
    }
}
