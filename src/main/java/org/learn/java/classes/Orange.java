package org.learn.java.classes;

public class Orange {
    public static int staticMethod() {
        System.out.println("IN STATIC METHOD");
        return 5;
    }

    {
        System.out.println("Initializing");
    }

    static {
        System.out.println("In Static block");
    }



    public Orange() {
        // this is a constructor
        System.out.println("In constructor");
    }


    public int Orange() {
        return 1;
    }
}
