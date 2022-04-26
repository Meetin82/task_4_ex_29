package ru.vsu.cs.semenov_d_s;

import java.util.Comparator;

public class SelectionSort {

    public static <T> void sort(T[] data, Comparator<T> c, int from, int to) {
        if (checkCorrectnessFromAndTo(data, from, to)) {
            for (int i = from; i <= to - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j <= to; j++) {
                    if (c.compare(data[j], data[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                T tmp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = tmp;
            }
        } else {
            printErrorText();
        }
    }

    public static <T extends Comparable<T>> void sort(T[] data, int from, int to) {
        sort(data, Comparable::compareTo, from, to);
    }

    private static <T> boolean checkCorrectnessFromAndTo(T[] data, int from, int to) {
        return (from >= 0 & from < data.length) & (to >= 0 & to < data.length);
    }

    private static void printErrorText() {
        System.out.println("Некорректно заданы значения from или to. Значения должны входить в размер массива! Сортировка не выполнена!");
    }
}