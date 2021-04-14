package org.learn.java.classes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrangeTests {
    @Test
    public void orangeTestConstructor() {
        Orange o = new Orange();
        Assertions.assertEquals(1, o.Orange());

        Orange orange = new Orange();

        Assertions.assertEquals(5,Orange.staticMethod());
    }

    @Test
    public void primitiveTypesTest() {
        int a = 5;
        Integer A = Integer.decode("10");
        Orange b = new Orange();
    }

}
