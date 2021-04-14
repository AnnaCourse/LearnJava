package org.learn.java.classes;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class ArraysLearn {

    public int[] sortInput(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public int searchInInput(int[] input, int findMe) {
        Arrays.sort(input);
        return Arrays.binarySearch(input, findMe);
    }





}
