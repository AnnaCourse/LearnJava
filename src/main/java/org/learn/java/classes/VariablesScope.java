
package org.learn.java.classes;

import java.util.ArrayList;

public class VariablesScope {

    private static String STRING_VALUE="????";

    public static int INT_VALUE;
    public static boolean BOOLEAN_VALUE;

    private int y;
    private int z;

    private ArrayList<String> list;

    public static String  staticMethod() {
        return "!!!!";
    }

    public int declareLocalVars(int param) {
        int a = 4;
        int b = 6;
        return a+b+param;
    }

    public int tryToDeclarWithInitialization() {
        int y = 10;
        int x = 20;
        int reply = x + y;
        return reply;
    }

    public int notInitializedLocalVar(int param) {
        int x;
        x = param;
        return x;
    }

    public int notInitializedInstanceVar() {
        z = 5;
        return y;
    }



}
