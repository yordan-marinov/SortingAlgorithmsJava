package com.tap.algos.BubbleSort;

import java.util.Arrays;

public class BubbleSortMain {

    public static int[] sortIntArray(int[] elementsArray) {
//        System.out.println(Arrays.toString(elementsArray));

        while (true) {
            boolean is_sorted = true;

            for (int i = 0; i < elementsArray.length - 1; i++) {
                int firstElement = elementsArray[i];
                int secondElement = elementsArray[i + 1];

                // Swapping places
                if (firstElement > secondElement) {
                    elementsArray[i] = secondElement;
                    elementsArray[i + 1] = firstElement;
                    is_sorted = false;
                }
            }
            if (is_sorted) break;
        }
        return elementsArray;
    }
}
