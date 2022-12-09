/* 37. Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь */

package task037_CheckBrackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Строка: ");
        String str = iScanner.nextLine();
        boolean check1 = CheckBrackets(str);
        iScanner.close();

        if (check1) {
            System.out.println("Да, в строке " + str + " последовательность скобок верная");
        } else if (!check1) {
            System.out.println("Нет, в строке " + str + " последовательность скобок неверная");
        }
    }

    static boolean CheckBrackets(String str) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
        pairs.put('<', '>');

        Stack<Character> states = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char el = str.charAt(i);

            if (pairs.containsKey(el)) {
                states.push(el);
            } else if (pairs.containsValue(el)) {
                if (states.empty()) {
                    return false;
                } else if (el == states.pop()) {
                    return false;
                }
            }
        }

        return states.isEmpty();
    }
}
