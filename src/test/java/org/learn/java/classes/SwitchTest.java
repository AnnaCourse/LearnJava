package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class SwitchTest {
    static Swithes s;
    @BeforeAll
    public static void setUp() {s = new Swithes();}

    @Test
    public void testingMonths() {
        Assertions.assertEquals("Winter",s.switchString("Jan"));
        Assertions.assertEquals("Still winter", s.switchString("Feb"));
        Assertions.assertEquals("Unknown month", s.switchString("asdfasdf"));
    }

    @Test
    public void testingMonths1() {
        Assertions.assertEquals("Winter",s.switchString1("Jan"));
        Assertions.assertEquals("Still winter", s.switchString1("Feb"));
        Assertions.assertEquals("Unknown month", s.switchString1("asdfasdf"));
    }

    @Test
    public void testingMonths2() {
        Assertions.assertEquals("Winter",s.switchString_2("Jan"));
        Assertions.assertEquals("Still winter", s.switchString_2("Feb"));
        Assertions.assertEquals("Unknown month", s.switchString_2("asdfasdf"));
    }

    @Test
    public void testingMonths3() {
        Assertions.assertEquals(Swithes.WINTER,s.switchString_3("Jan"));
        Assertions.assertEquals(Swithes.STILL_WINTER, s.switchString_3("Feb"));
        Assertions.assertEquals(Swithes.UNKNOW_MONTH, s.switchString_3("asdfasdf"));
    }


}
