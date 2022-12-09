/* 36. Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
- повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
- буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true */

package task036_CheckIzomorph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Строка 1: ");
        String str1 = iScanner.nextLine();
        System.out.println("Строка 2: ");
        String str2 = iScanner.nextLine();
        boolean check = CheckIzomorph(str1, str2);
        iScanner.close();

        if (check) {
            System.out.println("Да, строки " + str1 + " и " + str2 + " изоморфны");
        } else {
            System.out.println("Нет, строки " + str1 + " и " + str2 + " не изоморфны");
        }
    }

    static boolean CheckIzomorph(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        if (str1.equals(str2)) {
            return true;
        }
        Map<Character, Character> sub = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if (sub.containsKey(a) && sub.get(a) != b)
                return false;
            else {
                sub.put(a, b);
            }
        }

        return true;
    }
}
