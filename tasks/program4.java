// 4. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package tasks;

import java.util.LinkedList;
import java.util.Random;

public class program4 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = GetArr(5);
        System.out.println(lst);
        ReverseList(lst);
        System.out.println(lst);
    }

    static LinkedList<Integer> GetArr(int count) {
        LinkedList<Integer> lst = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            lst.add(rand.nextInt(20));
        }

        return lst;
    }

    static void ReverseList(LinkedList<Integer> lst) {
        for (int i = 0; i < lst.size() / 2; i++) {
            Integer temp = lst.get(i);
            lst.set(i, lst.get(lst.size() - i - 1));
            lst.set(lst.size() - i - 1, temp);
        }
    }
}
