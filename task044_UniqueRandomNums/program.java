/* 44. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве. */

package task044_UniqueRandomNums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> arr = getArr();
        HashSet<Integer> set = GetSetFromArray(arr);
        float perc = GetUniquePercent(set, arr);
        System.out.println(arr);
        System.out.println(set);
        System.out.println("Процент уникальных = " + perc);

    }

    public static ArrayList<Integer> getArr() {
        ArrayList<Integer> res = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            res.add(rand.nextInt(25));
        }

        return res;
    }

    public static HashSet<Integer> GetSetFromArray(ArrayList<Integer> arr) {
        HashSet<Integer> res = new HashSet<>(arr);

        for (Integer el : arr) {
            res.add(el);
        }

        return res;
    }

    public static float GetUniquePercent(HashSet<Integer> set, ArrayList<Integer> arr) {
        return set.size() * 100 / arr.size();
    }
}
