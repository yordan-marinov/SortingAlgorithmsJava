package com.tap.algos.MergeSort;

public class MergeSortMain {
    public static int[] sortIntArray(int[] elementsArray) {
        int sizeOfArray = elementsArray.length;
        int middleOfArray = elementsArray.length / 2;

        // Bottom of the recursion (elements are 1 or 0)
        if (sizeOfArray < 2) {
            return elementsArray;
        }

        int[] firstArray = new int[middleOfArray];
        int[] secondArray = new int[sizeOfArray - middleOfArray]; // in case when length is odd number

        // Simplified by the IDE - "Filling" the new arrays
        System.arraycopy(elementsArray, 0, firstArray, 0, firstArray.length);
        System.arraycopy(elementsArray, firstArray.length, secondArray, 0, secondArray.length);

        //Split each half recursively
        sortIntArray(firstArray);
        sortIntArray(secondArray);

        collectToArray(firstArray, secondArray, elementsArray);
        return elementsArray;
    }

    private static void collectToArray(int[] first, int[] second, int[] numbers) {
        int indexFirstArray = 0;
        int indexSecondArray = 0;
        int indexNumbersArray = 0;

        // Compare values between to arrays starting from 0-index
        while (indexFirstArray < first.length && indexSecondArray < second.length) {
            if (first[indexFirstArray] < second[indexSecondArray]) {
                numbers[indexNumbersArray] = first[indexFirstArray];
                indexFirstArray++;
            } else {
                numbers[indexNumbersArray] = second[indexSecondArray];
                indexSecondArray++;
            }
            indexNumbersArray++;
        }

        // Adding remaining elements of first array to the new combined array
        while (indexFirstArray < first.length) {
            numbers[indexNumbersArray] = first[indexFirstArray];
            indexFirstArray++;
            indexNumbersArray++;
        }
        // Adding remaining elements of second array to the new combined array
        while (indexSecondArray < second.length) {
            numbers[indexNumbersArray] = second[indexSecondArray];
            indexSecondArray++;
            indexNumbersArray++;
        }
    }
}
