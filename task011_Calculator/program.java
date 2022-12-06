/* 11. Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). Добавить логирование. Добавить возможность удалить последнюю операцию */

package task011_Calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        float res = Calc();
        System.out.println("Результат " + res);
    }

    static float Calc() {
        float res = 0;
        String[] signs = new String[] { "+", "-", "*", "/" };
        System.out.print(
                "Калькулятор. Действия - + - * /, отменить последнюю операцию - d, вывести результат и завершить - =:\n ");
        LinkedList<String> lst = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Число: ");
        String str = iScanner.nextLine();
        if (str.chars().allMatch(Character::isDigit)) {
            res = Float.parseFloat(str);
            lst.add(str);
        }

        while (!str.equals("=")) {
            if (Arrays.asList(signs).contains(lst.getLast())) {
                System.out.print("Число: ");
                str = iScanner.nextLine();
                if (str.equals("d")) {
                    lst.removeLast();
                } else if (str.chars().allMatch(Character::isDigit)) {
                    if (str.equals("0") && lst.getLast().equals("/")) {
                        System.out.print("На 0 делить нельзя. Введите другое число: ");
                    }
                    Float.parseFloat(str);
                    res = checkOp(res, Float.parseFloat(str), lst.getLast());
                    lst.add(str);
                    lst.add("" + res);
                }
                System.out.println("Результат " + res);
            } else {
                System.out.print("Знак операции: ");
                str = iScanner.nextLine();
                if (str.equals("d")) {
                    lst.removeLast();
                    lst.removeLast();
                    lst.removeLast();
                    res = Float.parseFloat(lst.getLast());
                    System.out.println("Результат " + res);
                } else if (Arrays.asList(signs).contains(str)) {
                    lst.add(str);
                }
            }
        }
        iScanner.close();

        return res;
    }

    static float checkOp(float res, float num, String sign) {
        float result = 0;
        switch (sign) {
            case "+":
                result = res + num;
                break;
            case "-":
                result = res - num;
                break;
            case "*":
                result = res * num;
                break;
            case "/":
                result = res / num;
                break;
        }

        return result;
    }
}
