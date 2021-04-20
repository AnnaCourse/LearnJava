package org.learn.java.classes;

public class Constructors {

    private String str;

    public Constructors(String str) {
        this.str = str;
    }

    public Constructors(int a) {
        this.str = String.valueOf(a);
    }

    public Constructors(String str, int a) {
        this.str = str+a;
    }

    public String getStr() {
        return this.str;
    }


}
