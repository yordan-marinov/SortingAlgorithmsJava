package com.tap.algos.Quicksort;

public class QuicksortMain {

    public static int[] sortIntArray(int[] elementsArray, int start, int end) {
        // Bottom of the recursion
        if (start < end) {
            int pivot = partition(elementsArray, start, end);

            // Sort before the pivot(exclusive)
            sortIntArray(elementsArray, start, pivot - 1);
            // Sort after the pivot(exclusive)
            sortIntArray(elementsArray, pivot + 1, end);
        }
        return elementsArray;
    }


    public static int partition(int[] elementsArray, int low, int high) {
        int pivot = elementsArray[high];
        int smallerElementIndex = (low - 1);

        for (int currentIndex = low; currentIndex < high; currentIndex++) {
            if (elementsArray[currentIndex] < pivot) {
                smallerElementIndex++;
                replace(elementsArray, smallerElementIndex, currentIndex);
            }
        }
        replace(elementsArray, smallerElementIndex + 1, high);

        return smallerElementIndex + 1;
    }


    public static void replace(int[] numbers, int first, int second) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
    }
}
