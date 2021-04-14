package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LoopsTest {

    @Test
    public void whileLoop() {
        Loops l = new Loops();
        Assertions.assertEquals(5,l.whileLoop(5));
    }
    @Test
    public void whileLoop_1() {
        Loops l = new Loops();
        Assertions.assertEquals(5,l.whileLoop_1(4));
    }


    @Test
    public void doWhileLoop() {
        Loops l = new Loops();
        Assertions.assertEquals(5,l.doWhileLoop(5));
    }

    @Test
    public void doWhileLoop_1() {
        Loops l = new Loops();
        Assertions.assertEquals(5,l.doWhileLoop_1(4));
    }

    @Test
    public void forLoop() {
        Loops l = new Loops();
        Assertions.assertEquals(5,l.loopFor(5));
    }

    @Test
    public void infinitLoop() {
        Loops l = new Loops();
        l.infinitLoopFor();
    }



    @Test
    public void forEachLoop() {
        Loops l = new Loops();
        int [] a = new int[] {1,2,3,4,5,6};
        l.forEachSimple(a);
    }

    @Test
    public void seeDifferentLoops() {
        Loops l = new Loops();
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        l.forLoop(arr,1);
        l.whileLoop(arr,1);
        l.doWhileLoop(arr,1);
    }

    @Test
    public void seeNestedLoops() {
        Loops l = new Loops();
        int[] x = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] y = new int[] {1,2,3,4,5,6,7,8,9,10};

        int[][] result = l.flatArrays(x,y);
        Assertions.assertEquals(2,result[0][0]);
        printTwoDemArray(result);

    }

    @Test
    public void seeNestedLoopsWithBreak() {
        Loops l = new Loops();
        int[] x = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] y = new int[] {1,2,3,4,5,6,7,8,9,10};

        int[][] result = l.flatArrayWithBreak(x,y);
        Assertions.assertEquals(2,result[0][0]);
        printTwoDemArray(result);

    }

    @Test
    public void seeNestedLoopsWithContinue() {
        Loops l = new Loops();
        int[] x = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] y = new int[] {1,2,3,4,5,6,7,8,9,10};

        int[][] result = l.flatArrayWithContinue(x,y);
        Assertions.assertEquals(20,result[x.length-1][y.length-1]);
        printTwoDemArray(result);
    }



    private void printTwoDemArray(int[][] a) {
        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a[i].length; j++) {
                if (a[i][j] == 0) System.out.print("          ");
                else System.out.print("a["+i+"]["+j+"] = "+a[i][j]+"  ");
            }
            System.out.println("\n-----------------");
        }
    }

}
