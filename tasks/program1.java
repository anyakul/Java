/* 1. Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022 */

package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class program1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Число римскими цифрами: ");
        String str = iScanner.nextLine();
        int num = GetInt(str);
        iScanner.close();
        System.out.println("Число " + str + " = " + num);
    }

    static int GetInt(String str) {
        int res = 0;
        Map<Character, Integer> pairs = new HashMap<>();
        pairs.put('I', 1);
        pairs.put('V', 5);
        pairs.put('X', 10);
        pairs.put('L', 50);
        pairs.put('C', 100);
        pairs.put('D', 500);
        pairs.put('M', 1000);

        Stack<Integer> states = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char el = str.charAt(i);
            int val = pairs.get(el);

            if (!states.isEmpty()) {
                int prevVal = states.lastElement();

                if (prevVal < val) {
                    res = res - prevVal - prevVal + val;
                } else {
                    res += val;
                }
            } else {
                res += val;
            }
            states.push(val);
        }

        return res;
    }
}
