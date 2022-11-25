/* 6. Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1 */

package task006_GetNumDegree;

import java.util.Scanner;
import java.lang.Math;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите степень: ");
        int num2 = iScanner.nextInt();
        float res = GetDegree(num1, num2);
        System.out.println("Число " + num1 + " в степени " + num2 + " равно " + res);
        iScanner.close();
    }

    static float GetDegree(int num1, int num2) {
        float res = num1;

        if (num2 == 0) {
            res = 1;
        } else {
            for (int i = 1; i < Math.abs(num2); i++) {
                res *= num1;
                System.out.println(res);
            }
            if (num2 < 0) {
                res = 1 / res;
            }
        }

        return res;
    }
}
