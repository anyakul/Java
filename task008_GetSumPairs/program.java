/* 8. Дан массив целых чисел, упорядоченный строго по возрастанию.
Дано некоторое число X, нужно менее чем за квадратное количество операций(то есть перебор всех пар) найти такие два любых элемента массива, что их сумма равна X, иначе вывести 0. */

package task008_GetSumPairs;

import java.util.Scanner;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] numArr = GetArr(iScanner);
        SortArr(numArr);
        System.out.println(Arrays.toString(numArr));
        System.out.print("Находимая сумма пар элементов массива: ");
        int sum = iScanner.nextInt();
        int[] res = GetSumPairs(sum, numArr);

        if (res[0] == 0 && res[1] == 0) {
            System.out.println("Таких пар нет");
        } else {
            System.out.println("Пара чисел " + Arrays.toString(res) + " дает сумму " + sum);
        }

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
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return arr;
    }

    static int[] GetSumPairs(int sum, int[] arr) {
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == sum) {
                        res[0] = arr[j];
                        res[1] = arr[i];
                        break;
                    }
                }
            }
        }

        return res;
    }
}
