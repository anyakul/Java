/* 30. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти. */

package task030_SaveStrings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Deque<String> lst = FillLst();
        System.out.println(lst);
    }

    static Deque<String> FillLst() {
        Deque<String> deque = new ArrayDeque<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите print чтобы вывести все строки с начиная с последней. Наберите revert чтобы удалить предыдущую введенную строку из памяти. Введите любую строку чтобы добавить её в список: ");
        System.out.println("Введите строку: ");
        String str = iScanner.nextLine();

        while (!str.equals("finish")) {
            if (!str.equals("print") && !str.equals("revert")) {
                deque.addFirst(str);
            } else if (str.equals("print")) {
                System.out.println(deque);
            } else if (str.equals("revert")) {
                deque.removeFirst();
            }
            System.out.println("Введите строку ");
            str = iScanner.nextLine();
        }

        iScanner.close();

        return deque;
    }
}
