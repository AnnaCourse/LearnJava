package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructorsTests {

    @Test
    public void checkConstructorsTest() {
        //Constructors con = new Constructors();
        Constructors conOne = new Constructors("APPLE");
        Constructors conTwo = new Constructors(6);
        Constructors conThree = new Constructors("ORANGE", 5);

        Assertions.assertEquals("APPLE",conOne.getStr());
        Assertions.assertEquals("6",conTwo.getStr());
        Assertions.assertEquals("ORANGE5",conThree.getStr());

    }

}
