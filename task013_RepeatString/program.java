/* 13. Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
N=5
c1=”Oleg”
c2=”Vasya”
res = “OlegVasyaOlegVasyaOleg” */

package task013_RepeatString;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Строка 1: ");
        String str1 = iScanner.nextLine();
        System.out.print("Строка 2: ");
        String str2 = iScanner.nextLine();
        System.out.print("Длина строки: ");
        int res_len = iScanner.nextInt();
        iScanner.close();
        StringBuilder res = getString(res_len, str1, str2);
        System.out.println(res);
    }

    static StringBuilder getString(int res_len, String str1, String str2) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < res_len; i++) {
            if (i % 2 == 0) {
                res.append(str1);
            } else {
                res.append(str2);
            }
        }

        return res;
    }
}
