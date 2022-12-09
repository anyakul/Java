/* 4. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

package tasks;

import java.util.HashMap;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        HashMap<Integer, String> phoneBook = GetPhoneBook();
        for (var el : phoneBook.entrySet()) {
            System.out.print(el.getKey() + ": " + el.getValue() + "\n");
        }
    }

    static HashMap<Integer, String> GetPhoneBook() {
        HashMap<Integer, String> lst = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Номер телефона и имя человека: ");
        String str = iScanner.nextLine();

        while (!str.equals("finish")) {
            String[] strArr = str.split(" ");
            lst.put(Integer.parseInt(strArr[0]), strArr[1]);
            System.out.println("Номер телефона и имя человека: ");
            str = iScanner.nextLine();
        }
        iScanner.close();

        return lst;
    }
}
