/* 3. Дан массив nums = [3,2,1,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
[2,2,3,3] */

package task003_ReplaceNum;

import java.util.Scanner;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] numArr = GetArr(iScanner);
        System.out.println(Arrays.toString(numArr));
        GetNewArr(numArr, iScanner);
        System.out.println(Arrays.toString(numArr));
        iScanner.close();
    }

    public static int[] GetArr(Scanner iScanner) {
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

    static void GetNewArr(int[] arr, Scanner iScanner) {
        System.out.print("Введите искомое число: ");
        int find_num = iScanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == find_num) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
