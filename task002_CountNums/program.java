/* 2. Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1. Найти максимальное количество подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом) */

package task002_CountNums;

import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        int[] numArr = new int[] { 1, 1, 0, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(numArr));
        int res = GetCountArr(numArr);
        System.out.println("Максимальное число единиц подряд - " + res);
    }

    static int GetCountArr(int[] arr) {
        int count = 0;
        int max_count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                    count = 0;
                }
            }
        }

        if (arr[arr.length - 1] == 1) {
            if (count > max_count) {
                max_count = count;
            }
        }

        return max_count;
    }
}
