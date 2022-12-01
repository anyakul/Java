/* 14. Напишите метод, который сжимает строку. 
Пример: вход aaaabbbcdd.
Выход abcd
charAt(i) и indefOf(s) */

package task014_CompressString;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Строка c повторяющимися символами: ");
        String str = iScanner.nextLine();
        iScanner.close();
        String res = GetString(str);
        System.out.println(res);
    }

    static String GetString(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (res.indexOf(str.charAt(i)) == -1) {
                res += str.charAt(i);
            }
        }

        return res;
    }
}
