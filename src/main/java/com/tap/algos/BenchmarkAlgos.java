package com.tap.algos;

import com.tap.algos.BubbleSort.BubbleSortMain;
import com.tap.algos.InsertionSort.InsertionSortMain;
import com.tap.algos.SelectionSort.SelectionSortMain;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class BenchmarkAlgos {
    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkQS() {
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkMS() {
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 1, warmups = 1)
    public void benchMarkBS() {
        BubbleSortMain.sortIntArray(Utils.generateArray(1000));
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkIS() {
        InsertionSortMain.sortIntArray(Utils.generateArray(1000));
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkSS() {
        SelectionSortMain.sortIntArray(Utils.generateArray(1000));
    }

}
