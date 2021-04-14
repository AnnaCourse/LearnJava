package org.learn.java.classes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MatrixIteratorsTests {
    static Integer[][] A = {{11,12,13},{21,22,23},{31,32,33}};
    static Integer[][] B = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
    @Test
    public void verticalTrevelThroughMatrix() {
        MatrixIterators itr = new MatrixIterators();
        itr.verticalIterationFromTopLeftCorner(B);
    }

}
