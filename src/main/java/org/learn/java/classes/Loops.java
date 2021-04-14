package org.learn.java.classes;

import java.util.Collection;

public class Loops {

    public int whileLoop(int x) {
        int i=0;
        while (i < x) {
            i++;
        }
        return i;
    }

    public int whileLoop_1(int x) {
        int i=0;
        while (i <= x) {
            i++;
        }
        return i;
    }

    public int doWhileLoop(int x) {
        int i=0;
        do {
            i++;
        } while (i < x);
        return i;
    }

    public int doWhileLoop_1(int x) {
        int i=0;
        do {
            i++;
        } while (i <= x);
        return i;
    }

    public int loopFor(int x) {
        int i;
        for (i=0; i < x; i++) {
            System.out.println(i);

        }
        return i;
    }
    public void infinitLoopFor() {
        short i=0;
        for (;;) {
            System.out.println(i++);
        }

    }

    public void forEachSimple(int [] a) {
        for (int x: a) {
            System.out.println(x);
        }
    }

    public void forLoop(int[] arr, int step) {
        for (int i=0; (i < arr.length) && (arr.length < 5); i+=step) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
        System.out.println("===========================");
    }

    public void whileLoop(int[] arr, int step) {
        int i=0;
        while ((i < arr.length) && (arr.length < 5)) {
            System.out.println("arr["+i+"] = "+arr[i]);
            i+=step;
        }
        System.out.println("===========================");
    }

    public void doWhileLoop(int[] arr, int step) {
        int i = 0;
        do {
            System.out.println("arr[" + i + "] = " + arr[i]);
            i+=step;
        } while ((i < arr.length) && (arr.length < 5));
        System.out.println("===========================");
    }

    public <T extends String> void  forEach  (Collection<T> input) {
        for( T t: input) {
            System.out.println(toString());
        }
    }

    public <T> void getInfo(T input) {
    }

    public int [][] flatArrays(int[] a, int[] b) {
        int[][] result = new int[a.length][b.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                result[i][j] = a[i]+b[j];
            }
        }
        return result;
    }

    public int [][] flatArrayWithBreak(int[] a, int[] b) {
        int[][] result = new int[a.length][b.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                result[i][j] = a[i]+b[j];
                if (result[i][j] > 10) break;
            }
        }
        return result;
    }

    public int [][] flatArrayWithContinue(int[] a, int[] b) {
        int[][] result = new int[a.length][b.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i]+b[j] < 10) continue;
                result[i][j] = a[i]+b[j];

            }
        }
        return result;
    }








}
