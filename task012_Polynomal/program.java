/* 12. Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена многочлен степени k. 
*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0 */

package task012_Polynomal;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        String res = create_str(5);
        System.out.println(res);
    }

    static int get_random() {
        return ThreadLocalRandom.current().nextInt(1, 101);
    }

    static int[] create_lst(int k) {
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = get_random();
        }

        return arr;
    }

    static String create_str(int k) {
        int[] arr = create_lst(k);
        String res_str = "";
        System.out.println(Arrays.toString(arr));

        if (arr.length < 1) {
            res_str = "x = 0";
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i);
                System.out.println(arr[i]);
                if (i != arr.length - 1 && arr[i] != 0) {
                    if (i == arr.length - 2) {
                        res_str += (arr[i]) + "x";
                    } else {
                        res_str += (arr[i]) + "x^" + (arr.length - i - 1);
                    }
                }
                if (i < arr.length - 1 && arr[i + 1] != 1) {
                    res_str += " + ";
                } else if (i == arr.length - 1 && arr[i] != 1) {
                    res_str += arr[i] + " = 0";
                } else if (i == arr.length - 1 && arr[i] == 0) {
                    res_str += " = 0";
                }
            }
        }

        return res_str;
    }
}
