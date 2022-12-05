package examples.example040_Queue;

import java.util.*;
public class program {
   public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<Integer>();
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(4);
       System.out.println(queue); // [1, 2, 3, 4]
       int item = queue.remove();
       System.out.println(item);
       System.out.println(queue); // [2, 3, 4]
       queue.offer(2809);
       item = queue.remove();
       System.out.println(queue); // [3, 4, 2809]
       item = queue.remove();
       System.out.println(queue); // [4, 2809]
       item = queue.poll();
       System.out.println(queue); // [2809]
   }
}
