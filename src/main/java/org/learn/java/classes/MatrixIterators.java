package org.learn.java.classes;

import java.util.ArrayList;

public class MatrixIterators {


    public <T extends Object> void verticalIterationFromTopLeftCorner(T[][] array) {
        final int rows = array.length;
        final int columns = array[0].length;
        int startRow=0;
        int lastRow = rows;
        int currentColummn=0;
        while(currentColummn < columns) {
            T[] col = getColumn(array,currentColummn,0, rows);
            iterateThroughArray(col,startRow,lastRow);
            currentColummn++;
            int temp = startRow;
            startRow = lastRow;
            lastRow = temp;
        }

    }

    private <T extends Object> void iterateThroughArray (T[] input, int from, int to) {
        if (from < to) {
            for (int i = from; i < to; i++) {
                doSomethingWithElement(input[i]);
            }
        }
        else if (from >= to) {
            for (int i = from-1; i >=to; i--) {
                doSomethingWithElement(input[i]);
            }
        }
     }

     private <T extends Object> T[] getColumn(T[][] input, int column, int from, int to) {
         T[] col = (T[])new Object[input.length];
         for (int i = from; i < to; i++) {
             col[i]= input[i][column];
         }
         return col;
     }

     private <T extends Object> void doSomethingWithElement(T input) {
         System.out.println(input.toString());
     }
}
