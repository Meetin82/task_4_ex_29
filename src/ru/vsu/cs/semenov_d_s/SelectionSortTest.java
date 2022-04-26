package ru.vsu.cs.semenov_d_s;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort1() {
        Integer[] arr = {1, 6, 5, 3, 7, 8};
        int from = 0;
        int to = 2;

        Integer[] expectedResult = {1, 5, 6, 3, 7, 8};

        SelectionSort.sort(arr, from, to);

        Assert.assertArrayEquals(expectedResult, arr);
    }

    @Test
    public void testSelectionSort2() {
        Integer[] arr = {9, 1};
        int from = 0;
        int to = 0;

        Integer[] expectedResult = {9, 1};

        SelectionSort.sort(arr, from, to);

        Assert.assertArrayEquals(expectedResult, arr);
    }

    @Test
    public void testSelectionSort3() {
        Integer[] arr = {3, 4, 1, 2};
        int from = 1;
        int to = 3;

        Integer[] expectedResult = {3, 1, 2, 4};

        SelectionSort.sort(arr, from, to);

        Assert.assertArrayEquals(expectedResult, arr);
    }

    @Test
    public void testSelectionSort4() {
        Integer[] arr = {0, 1, 2, 5, 3};
        int from = 3;
        int to = 4;

        Integer[] expectedResult = {0, 1, 2, 3, 5};

        SelectionSort.sort(arr, from, to);

        Assert.assertArrayEquals(expectedResult, arr);
    }

    @Test
    public void testSelectionSort5() {
        Integer[] arr = {1, 3, 2, 1};
        int from = 0;
        int to = 3;

        Integer[] expectedResult = {1, 1, 2, 3};

        SelectionSort.sort(arr, from, to);

        Assert.assertArrayEquals(expectedResult, arr);
    }
}
