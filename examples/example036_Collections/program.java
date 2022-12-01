package examples.example036_Collections;

import java.util.List;

public class program {
   public static void main(String[] args) {
       List<Character> list1 = 
           List.of('S', 'e', 'r', 'g', 'e', 'y');
       System.out.println(list1);
       // list1.remove(1); // java.lang.UnsupportedOperationException
       List<Character> list2 = List.copyOf(list1);
       System.out.println(list2);

   }
}

