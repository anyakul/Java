/* 20. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */

package task020_BumbleSort;

import java.util.Scanner;
import java.util.Arrays;

import java.io.IOException;
import java.util.logging.*;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] numArr = GetArr(iScanner);
        SortArr(numArr);
        System.out.println(Arrays.toString(numArr));

        iScanner.close();
    }

    static int[] GetArr(Scanner iScanner) {
        System.out.print("Введите число элементов массива: ");
        int count_arr = iScanner.nextInt();
        int[] arr = new int[count_arr];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число массива: ");
            int num = iScanner.nextInt();
            arr[i] = num;
        }

        return arr;
    }

    static int[] SortArr(int[] arr) {
        boolean sorted = false;
        int temp;
        Logger logger = Logger.getLogger(program.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh;
        try {
            fh = new FileHandler("task020_BumbleSort/log.txt");
            logger.addHandler(ch);
            logger.addHandler(fh);

            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            while (!sorted) {
                sorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        sorted = false;
                    }
                    logger.setLevel(Level.INFO);
                    logger.info(Arrays.toString(arr));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
}
