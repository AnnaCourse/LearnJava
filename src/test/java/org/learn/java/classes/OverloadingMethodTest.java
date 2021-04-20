package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OverloadingMethodTest {

    @Test
    public void testOverloadingMethod() {
        OverloadingMethods ovr = new OverloadingMethods();
        String out1 = ovr.method("apple");
        String out2 = ovr.method("orange", 5);
        ovr.method(7);
        int out3 = ovr.method(5,7);
        Assertions.assertEquals("apple",out1);
        Assertions.assertEquals("orange - 5",out2);
        Assertions.assertEquals(12,out3);
    }

}
