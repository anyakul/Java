// 9. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package task009_Factorial;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Число: ");
        int num = iScanner.nextInt();
        int res = GetFactorial(num);
        System.out.println("Факториал числа " + num + " = " + res);
        iScanner.close();
    }

    static int GetFactorial(int num) {
        int res = 1;

        if (num == 0) {
            res = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                res = res * i;
            }
        }


        return res;
    }
}
