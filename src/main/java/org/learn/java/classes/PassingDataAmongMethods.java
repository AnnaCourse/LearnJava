package org.learn.java.classes;

public class PassingDataAmongMethods {
    public String updateString(String input) {
        input = input + " " + input;
        return input;
    }

    public String updateStringBuilder(StringBuilder builder) {
        return builder.append(builder.toString()).toString();
    }

    public int updatePrimitives(int a) {
        a = a * 4;
        return a;
    }
}
