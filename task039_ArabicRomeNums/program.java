/* 39. Написать метод, который переведёт данное целое число в римский формат. */

package task039_ArabicRomeNums;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Число арабскими цифрами: ");
        int num = iScanner.nextInt();

        if (num < 0 || num > 3999) {
            System.out.println("Число не может быть преобразовано в римские");
        } else {
            String str = GetStr(num);
            System.out.println("Число " + num + " = " + str);
        }
        iScanner.close();
    }

    static String GetStr(int num) {
        String romanOnes = romanDigit(num % 10, "I", "V", "X");
        num /= 10;
        String romanTens = romanDigit(num % 10, "X", "L", "C");
        num /= 10;
        String romanHundreds = romanDigit(num % 10, "C", "D", "M");
        num /= 10;
        String romanThousands = romanDigit(num % 10, "M", "", "");

        String res = romanThousands + romanHundreds + romanTens + romanOnes;
        return res;
    }

    public static String romanDigit(int n, String one, String five, String ten) {
        if (n >= 1) {
            switch (n) {
                case 1:
                    return one;
                case 2:
                    return one + one;
                case 3:
                    return one + one + one;
                case 4:
                    return one + five;
                case 5:
                    return five;
                case 6:
                    return five + one;
                case 7:
                    return five + one + one;
                case 8:
                    return five + one + one + one;
                case 9:
                    return one + ten;
            }

        }
        return "";
    }

}
