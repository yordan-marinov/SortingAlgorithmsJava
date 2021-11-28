
package com.tap.algos.InsertionSort;

import java.util.Arrays;

public class InsertionSortMain {

    public static int[] sortIntArray(int[] elementsArray) {
//        System.out.println("Raw array: " + Arrays.toString(elementsArray));

        for (int i = 1; i < elementsArray.length; i++) {
            // Setting the end of the sorted array
            int lastIndexSorted = i - 1;
            int lastSortedNumber = elementsArray[i - 1];
            // Setting the beginning the unsorted part
            int firstIndexUnsorted = i;
            int firstUnsortedNumber = elementsArray[i];

            // i - last index of the sorted array
            for (int j = i; j > 0; j--) {
                int firstElement = elementsArray[j];
                int secondElement = elementsArray[j - 1];
                if (firstElement < secondElement) {
                    elementsArray[j - 1] = firstElement;
                    elementsArray[j] = secondElement;
                } else break;
            }
        }
        return elementsArray;
    }
}
