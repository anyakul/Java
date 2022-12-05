/* 28. Замерьте время, за которое в ArrayList добавятся 10000 элементов. Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.. */

package task028_TimeLinkedArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Spent time for ArrayList: " + time);
        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("Spent time for LinkedList: " + time);
    }
}
