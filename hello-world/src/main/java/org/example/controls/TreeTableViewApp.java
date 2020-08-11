package org.example.controls;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class TreeTableViewApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 列表
        Person rootPerson = new Person("根", 18, "中国");
        List<Person> persons = List.of(
                new Person("张三", 38, "北京"),
                new Person("李四", 48, "上海"),
                new Person("王五", 58, "广州")
        );
        TreeItem<Person> root = new TreeItem<>(rootPerson);
        persons.forEach(person -> root.getChildren().add(new TreeItem<>(person)));
        TreeTableView<Person> table = new TreeTableView<>(root);

        TreeTableColumn<Person, String> col1 = new TreeTableColumn<>("姓名");
        col1.setCellValueFactory(new TreeItemPropertyValueFactory<>(rootPerson.nameProperty().getName()));
        TreeTableColumn<Person, String> col2 = new TreeTableColumn<>("年龄");
        col2.setCellValueFactory(new TreeItemPropertyValueFactory(rootPerson.ageProperty().getName()));
        TreeTableColumn<Person, String> col3 = new TreeTableColumn<>("城市");
        col3.setCellValueFactory(new TreeItemPropertyValueFactory(rootPerson.homeProperty().getName()));

        table.getColumns().setAll( col1,col2, col3);

        Scene scene = new Scene(new StackPane(table), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * 用户
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
