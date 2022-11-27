/* 7. На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d ( +2 ), к a рибавляется d
Написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 1, d = 3
ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: “”.  */

package task007_GetNumFromNum;

import java.util.Scanner;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = iScanner.nextInt();
        System.out.print("b: ");
        int b = iScanner.nextInt();
        System.out.print("c: ");
        int c = iScanner.nextInt();
        System.out.print("d: ");
        int d = iScanner.nextInt();
        ArrayList<String> res = GetArr(a, b, c, d);

        if (a > b) {
            System.out.println("Из числа " + a + " получить " + b + " нельзя");
        } else if (a == b) {
            System.out.println(a + " уже равно " + b);
        } else {
            System.out.println(
                    "Из числа " + a + " получить " + b + " можно следующей последовательностью действий: " + res);
        }

        iScanner.close();
    }

    static ArrayList<String> GetArr(int a, int b, int c, int d) {
        ArrayList<String> list = new ArrayList<>();
        int start_num = a;

        while (start_num < b) {
            if (c > 1) {
                if (start_num * c <= b) {
                    start_num *= c;
                    list.add("k1");
                } else if (start_num * c > b) {
                    if (start_num + d <= b) {
                        start_num += d;
                        list.add("k2");
                    } else {
                        int num = b - start_num;
                        list.add("k3-" + num);
                        start_num += num;
                    }
                }
            } else if (c <= 1) {
                if (start_num + d <= b) {
                    start_num += d;
                    list.add("k2");
                } else {
                    int num = b - start_num;
                    list.add("k3-" + num);
                    start_num += num;
                }
            }
        }

        return list;
    }
}
