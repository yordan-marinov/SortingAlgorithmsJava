package com.tap.algos.SelectionSort;

import java.util.Arrays;

public class SelectionSortMain {

    public static int[] sortIntArray(int[] elementsArray) {
        // Unsorted array print for debug
//        System.out.println("Raw array: " + Arrays.toString(elementsArray));

        for (int i = 0; i < elementsArray.length; i++) {
            int minValue = elementsArray[i];
            int minValueIndex = i;

            for (int j = i + 1; j < elementsArray.length; j++) {
                if (elementsArray[j] < minValue) {
                    minValue = elementsArray[j];
                    minValueIndex = j;
                }
            }
            if (minValue < elementsArray[i]) {
                int minGenValue = elementsArray[i];
                elementsArray[i] = minValue;
                elementsArray[minValueIndex] = minGenValue;
            }
        }
        return elementsArray;
    }
}
