package org.example;

/**
 * 使用public修饰词，否则无法调用
 */
public class JavaAction {
    public void hello() {
        System.out.println("hello()");
    }

    public void haha(String name) {
        System.out.println("haha," + name);
    }
}
