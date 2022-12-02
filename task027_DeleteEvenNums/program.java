/* 27. Пусть дан произвольный список целых чисел, удалить из него четные числа */

package task027_DeleteEvenNums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> lst = GetRandomArray(count);
        System.out.println(lst);
        List<Integer> res = DeleteEvenNums(lst);
        System.out.println(res);
    }

    static ArrayList<Integer> GetRandomArray(int count) {
        ArrayList<Integer> lst = new ArrayList<>(count);
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            lst.add(rand.nextInt(100));
        }

        return lst;
    }

    static List<Integer> DeleteEvenNums(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }

        return arr;
    }
}
