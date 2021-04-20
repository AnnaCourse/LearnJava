package org.learn.java.classes;

public class OverloadingMethods {

    public String method(String input) {
        return input;
    }

    public String method(String input, int a) {
        return input+" - "+a;
    }

    public void method(int input) {

    }

    public int method(int a, int b) {
        return a+b;
    }
}
