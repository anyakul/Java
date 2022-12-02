/* 22. Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран. */

package task022_RandomNums;

import java.util.ArrayList;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> lst = GetRandomArray(count);
        System.out.println(lst);
        lst.sort(Integer::compareTo);
        System.out.println(lst);
    }

    static ArrayList<Integer> GetRandomArray(int count) {
        ArrayList<Integer> lst = new ArrayList<>(count);
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            lst.add(rand.nextInt(20));
        }

        return lst;
    }
}
