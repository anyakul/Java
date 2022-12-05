/* 3. Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. */

package tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class program3 {
    public static void main(String[] args) {
        String[] strArr = new String[] { "str1", "str2", "str3" };
        Stack<String> stack = GetStack(strArr);
        System.out.println(stack);
        Queue<String> queue = GetQueue(strArr);
        System.out.println(queue);
    }

    static Stack<String> GetStack(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String el : arr) {
            stack.push(el);
        }

        return stack;
    }

    static Queue<String> GetQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();

        for (String el : arr) {
            queue.add(el);
        }

        return queue;
    }
}
