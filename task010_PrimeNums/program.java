//10. Вывести все простые числа от 1 до 1000

package task010_PrimeNums;

import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        int num = 1000;
        ArrayList<Integer> res = GetArr(num);
        System.out.println(res);
    }

    static ArrayList<Integer> GetArr(int num) {
        ArrayList<Integer> lst = new ArrayList<>();
        int add_num = 0;

        for (int i = 2; i < num; i++) {
            for (int j = 3; j < i; j++) {
                if (i != j) {
                    if (i % j == 0) {
                        add_num = 0;
                        break;
                    } else {
                        add_num = i;
                    }
                }
            }
            if (add_num != 0) {
                lst.add(add_num);
            }
        }

        return lst;
    }
}
