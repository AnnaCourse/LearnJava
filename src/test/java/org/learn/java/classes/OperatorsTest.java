package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperatorsTest {

    private Operators o = new Operators();

    @Test
    public void unaryPlusAfterTest() {
        Assertions.assertEquals(5, o.unaryPlusAfter(5));
    }

    @Test
    public void unaryPlusBeforeTest() {
        Assertions.assertEquals(5, o.unaryPlusBefore(4));
    }

    @Test
    public void unarayNegativeLogicTest() {
        Assertions.assertTrue(o.unaryLogicalOposite(false));
    }

    @Test
    public void testModulus() {
        Assertions.assertEquals(1, o.modulus(10, 3));
    }

    @Test
    public void varPromotions() {
        int a = 5;
        long b = 6;
        long c = a + b;
        System.out.println(c);
        long t = 192301398193810323L;
    }

    @Test
    public void inclANDTest() {
        boolean vals[] = new boolean[] {true, false};
        for (boolean x: vals) {
            for (boolean y: vals) {
                System.out.println("x=" + x +" y=" + y +" x&y="+o.inclAND(x,y));
            }
        }
    }


    @Test
    public void ifStatementIllustraation() {
        if (2 == 2) System.out.println("2 = 2");

        if (2 == 2) {
            System.out.println("2 = 2");
            System.out.println("2 == 2");
        }

        Assertions.assertFalse(o.compare(12,5));
        Assertions.assertTrue(o.compare(3,3));

    }

    @Test
    public void complexComparisonTest() {
        Assertions.assertTrue(o.complexCompare(2,3));
    }

    @Test
    public void ternaryExpression() {
        Assertions.assertEquals(5, o.ternaryComparison(2,2));
        Assertions.assertEquals(6,o.ternaryComparison(3,2));
    }

}
