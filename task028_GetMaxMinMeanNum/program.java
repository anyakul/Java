/* 28. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка */

package task028_GetMaxMinMeanNum;

import java.util.ArrayList;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> lst = GetRandomArray(count);
        System.out.println(lst);
        GetMinMaxMeanNum(lst);
    }

    static ArrayList<Integer> GetRandomArray(int count) {
        ArrayList<Integer> lst = new ArrayList<>(count);
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            lst.add(rand.nextInt(100));
        }

        return lst;
    }

    static void GetMinMaxMeanNum(ArrayList<Integer> lst) {
        int max_num = lst.get(0);
        int min_num = lst.get(0);
        int sum = 0;

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max_num) {
                max_num = lst.get(i);
            } else if (lst.get(i) < min_num) {
                min_num = lst.get(i);
            }
            sum += lst.get(i);
        }
        int mean = sum / lst.size();

        System.out.println(
                "Максимальное число " + max_num + ", минимальное - " + min_num + ". Среднее арифметическое - " + mean);
    }
}
