package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysLearnTests {
    @Test
    public void sortIntArray() {
        int[] a = {5,3, 7, 10, 1};
        int hashA = a.hashCode();
        ArraysLearn arraysLearn = new ArraysLearn();
        int[] b = arraysLearn.sortInput(a);
        int hashB = b.hashCode();
        Assertions.assertEquals(hashA, hashB);
        Assertions.assertEquals(1,b[0]);
    }

    @Test
    public void searchTest() {
        ArraysLearn al = new ArraysLearn();
        int[] a = {6,3,10,0,8}; // {0,3,6,8,10}
        int result = al.searchInInput(a, 10);
        Assertions.assertEquals(4, result);
    }
}
