/* 24. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа. */

package task024_DeleteNums;

import java.util.ArrayList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        ArrayList<String> lst = GetArr();
        System.out.println(lst);
        GetNewArr(lst);
        System.out.println(lst);
    }

    public static ArrayList<String> GetArr() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число элементов массива: ");
        int count_arr = iScanner.nextInt();
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i <= count_arr; i++) {
            System.out.print("Введите число или строку массива: ");
            String num = iScanner.nextLine();
            res.add(i, num);
        }

        iScanner.close();
        res.remove(0);

        return res;
    }

    static void GetNewArr(ArrayList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            try {
                Integer.parseInt(lst.get(i));
                lst.remove(i);
                i--;
            } catch (NumberFormatException e) {
                continue;
            }
        }
    }
}
