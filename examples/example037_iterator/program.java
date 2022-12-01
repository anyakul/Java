package examples.example037_iterator;

import java.util.*;

public class program {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();

        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }
}
