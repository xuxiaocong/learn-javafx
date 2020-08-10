package org.example.controls;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

/**
 * 表格 TableView
 */
public class TableViewApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 列表
        List<Person> persons = List.of(
                new Person("张三", 38, "北京"),
                new Person("李四", 48, "上海"),
                new Person("王五", 58, "广州")
        );
        //绑定数据
        ObservableList<Person> teamMembers = FXCollections.observableArrayList(persons);
        TableView<Person> table = new TableView<>(teamMembers);
        // 绑定列
        TableColumn<Person, String> col1 = new TableColumn<>("姓名");
        col1.setCellValueFactory(new PropertyValueFactory<>(persons.get(0).nameProperty().getName()));
        TableColumn<Person, Integer> col2 = new TableColumn<>("年龄");
        col2.setCellValueFactory(new PropertyValueFactory<>(persons.get(0).ageProperty().getName()));
        TableColumn<Person, String> col3 = new TableColumn<>("城市");
        col3.setCellValueFactory(new PropertyValueFactory<>(persons.get(0).homeProperty().getName()));

        table.getColumns().setAll(col1, col2, col3);

        Scene scene = new Scene(new StackPane(table), 320, 240);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * 用户，给TableView使用
     */
    public static class Person {
        private StringProperty name;
        private IntegerProperty age;
        private StringProperty home;

        public Person(String name, Integer age, String home) {
            this.setName(name);
            this.setAge(age);
            this.setHome(home);
        }

        public String getName() {
            return this.nameProperty().get();
        }

        public void setName(String name) {
            this.nameProperty().set(name);
        }

        public StringProperty nameProperty() {
            if (this.name == null) {
                this.name = new SimpleStringProperty(this, "name");
            }
            return this.name;
        }

        public Integer getAge() {
            return this.ageProperty().get();
        }

        public void setAge(Integer age) {
            this.ageProperty().set(age);
        }

        public IntegerProperty ageProperty() {
            if (this.age == null) {
                this.age = new SimpleIntegerProperty(this, "age");
            }
            return this.age;
        }

        public String getHome() {
            return homeProperty().get();
        }

        public void setHome(String home) {
            this.homeProperty().set(home);
        }

        public StringProperty homeProperty() {
            if (this.home == null) {
                this.home = new SimpleStringProperty(this, "home");
            }
            return this.home;
        }
    }
}

