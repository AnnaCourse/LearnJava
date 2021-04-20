package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class TestPassingDataAmongMethods {
    private  PassingDataAmongMethods pd;

    @BeforeEach
    public void setUp() {
        pd = new PassingDataAmongMethods();
    }

    @Test
    public void passingStringTest() {
        String myString = "QWERTY";
        String out = pd.updateString(myString);
        Assertions.assertEquals("QWERTY",myString);
        Assertions.assertEquals(myString + " " + myString, out);
    }

    @Test
    public void passingStringBuilder() {
        String qwerty = "QWERTY";
        StringBuilder builder = new StringBuilder(qwerty);
        String out = pd.updateStringBuilder(builder);
        Assertions.assertEquals(qwerty + qwerty, builder.toString());
        Assertions.assertEquals(qwerty + qwerty, out);
    }

    @Test
    public void updatePrimitives() {
        int i = 5;
        int out = pd.updatePrimitives(i);
        Assertions.assertEquals(5,i);
        Assertions.assertEquals(4*i,out);
    }
}
