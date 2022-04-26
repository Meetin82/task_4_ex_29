package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = ArrayUtils.readIntArrayFromConsole();

        System.out.print("Введите с какого элемента необходимо провести сортировку: ");
        int from = readNumber();

        System.out.print("Введите до какого элемента необходимо провести сортировку: ");
        int to = readNumber();


        System.out.print(Arrays.toString(arr) + " => ");
        SelectionSort.sort(arr, from, to);
        System.out.println(Arrays.toString(arr));
    }

    private static int readNumber() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}
