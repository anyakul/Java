package examples.example043_DequeDoubleEndedQueue;

import java.util.*;

public class program {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        System.out.println(deque); // 1
        deque.addLast(2);
        System.out.println(deque); // 1, 2
        deque.removeFirst();
        System.out.println(deque); // 2
        deque.removeLast();
        System.out.println(deque); // []
        deque.offerFirst(1);
        System.out.println(deque); // 1
        deque.offerLast(2);
        System.out.println(deque); // 1, 2
        deque.pollFirst();
        System.out.println(deque); // 2
        deque.pollLast();
        System.out.println(deque); // []
        // deque.getFirst();
        // deque.getLast();
        // deque.peekFirst();
        // deque.peekLast();
    }
}
