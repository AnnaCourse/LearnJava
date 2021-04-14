package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReturnsTests {
    private DifferentReturnTypes d = new DifferentReturnTypes();

    @Test
    public void intValueReturn() {
        Assertions.assertEquals(1,d.returnsIntValue());
    }

    @Test
    public void echoTest() {
       Assertions.assertEquals("Hello World!",d.echo("Hello World!"));
    }

    @Test
    public void testingVoidMethod() {
        d.noReturns(2,3);
    }

    @Test
    public void testNotConstMethod() {
        int java_learn;
        d.DifferentReturnTypes();
    }

}
