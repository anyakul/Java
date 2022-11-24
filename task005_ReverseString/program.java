package task005_ReverseString;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String str = getString();
        System.out.println(ReverseString(str));
    }

    static String getString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку слов: ");
        String str = iScanner.nextLine();
        iScanner.close();
        return str;
    }

    static String ReverseString(String str) {
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        String res = String.join(" ", arr);

        return res;
    }
}
