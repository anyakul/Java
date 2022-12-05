/* 1. Реализовать консольное приложение,которое:Принимает от пользователя строку вида text~num Нужно рассплитить строку по~,сохранить text в связный список на позицию num.Если введено print~num,выводит строку из позиции num в связном списке и удаляет её из списка. */

package tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        LinkedList<String> lst = FillLst();
        System.out.println(lst);
    }

    static LinkedList<String> FillLst() {
        LinkedList<String> lst = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строка вида text~num, чтобы вывести элемент введите print~num: ");
        String str = iScanner.nextLine();
        String[] arrStr = str.split("~");

        while (!str.equals("finish")) {
            if (!str.equals("finish")) {
                arrStr = str.split("~");
                if (!arrStr[0].equals("print")) {
                    lst.add(Integer.parseInt(arrStr[1]), arrStr[0]);
                    System.out.println(lst);
                } else {
                    System.out.println(lst.get(Integer.parseInt(arrStr[1])));
                    lst.remove(arrStr[1]);
                }
            }
            System.out.println("Введите строка вида text ~ num, чтобы вывести элемент введите print ~ num: ");
            str = iScanner.nextLine();
        }

        iScanner.close();

        return lst;
    }
}
