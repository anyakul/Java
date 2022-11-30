/* 15. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
equals и StringBulder для revers */

package task015_Checkpolindrom;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Строка c повторяющимися символами: ");
        String str = iScanner.nextLine();
        iScanner.close();
        boolean res = CheckPolindrom(str);
        if (res) {
            System.out.println("Да, строка " + str + " полиндром");
        } else {
            System.out.println("Нет, строка " + str + " не полиндром");
        }
    }

    static boolean CheckPolindrom(String str) {
        String[] str_arr = str.split("");
        boolean res = false;
        int j = str.length() - 1;
        int str_len = str.length() / 2;
        if (str_len % 2 == 1) {
            str_len += 1;
        }

        for (int i = 0; i < str_len; i++) {
            if (str_arr[i].equals(str_arr[j])) {
                res = true;
                j--;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }
}
