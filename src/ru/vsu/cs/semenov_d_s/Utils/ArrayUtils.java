package ru.vsu.cs.semenov_d_s.Utils;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayUtils {

    public static Integer[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        return list.toArray(new Integer[0]);
    }

    public static Integer[] readIntArrayFromConsole(String arrName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                if (arrName == null || arrName.length() == 0) {
                    arrName = "";
                } else {
                    arrName = " " + arrName;
                }
                System.out.printf("Введите массив%s:%n", arrName);
                String line = scanner.nextLine();
                return toIntArray(line);
            } catch (Exception e) {
                System.out.print("Вы ошиблись, попробуйте еще раз! ");
            }
        }
    }

    public static Integer[] readIntArrayFromConsole() {
        return readIntArrayFromConsole(null);
    }
}
