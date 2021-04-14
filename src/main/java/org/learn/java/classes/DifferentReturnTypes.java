package org.learn.java.classes;

public class DifferentReturnTypes {

    public void DifferentReturnTypes() {
        System.out.println("This is Constructor.");
    }

    public DifferentReturnTypes() {
        System.out.println("This is not a constructor.");
    }

    public int returnsIntValue() {
        return 1;
    }

    public String echo(String input) {
        return input;
    }

    public void noReturns(int a, int b) {
        int s = a+b;
        System.out.println("summa in noReturns method: "+s);
    }

}
