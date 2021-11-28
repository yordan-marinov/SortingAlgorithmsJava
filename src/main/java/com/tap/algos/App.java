package com.tap.algos;

import com.tap.algos.BubbleSort.BubbleSortMain;
import com.tap.algos.InsertionSort.InsertionSortMain;
import com.tap.algos.SelectionSort.SelectionSortMain;

import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
//        org.openjdk.jmh.Main.main(args);
//
        int[] unsorted = Utils.generateArray(10);
//
//        int[] sorted = BubbleSortMain.sortIntArray(unsorted);
//        System.out.println(Arrays.toString(sorted));

//        int[] sorted = InsertionSortMain.sortIntArray(unsorted);
//        System.out.println("   Sorted: " + Arrays.toString(sorted));

        int[] sorted = SelectionSortMain.sortIntArray(unsorted);
        System.out.println("   Sorted: " + Arrays.toString(sorted));

    }
}
