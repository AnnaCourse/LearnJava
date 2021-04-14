package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocalVarsTests {
    @Test
    public void runLocalVars() {
        VariablesScope l = new VariablesScope();
        Assertions.assertEquals(10,l.declareLocalVars(0));
        Assertions.assertEquals(30,l.tryToDeclarWithInitialization());
    }

    @Test
    public void checkStaticVars() {
        Assertions.assertEquals(false, VariablesScope.BOOLEAN_VALUE);
        Assertions.assertEquals(0, VariablesScope.INT_VALUE);
        VariablesScope.BOOLEAN_VALUE = true;
        Assertions.assertTrue(VariablesScope.BOOLEAN_VALUE);
        VariablesScope.INT_VALUE = 10;
        Assertions.assertEquals(10,VariablesScope.INT_VALUE);
        Assertions.assertEquals("!!!!",VariablesScope.staticMethod());

    }
}
