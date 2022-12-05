/* 5. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */

package tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Queue<String> queue = GetQueue();
        System.out.println(queue);
    }

    static Queue<String> GetQueue() {
        System.out.print(
                "строка - добавить элемент в конец очереди, dequeue - показать и удалить первый элемент из очереди. first - показать первый элемент из очереди");
        Queue<String> queue = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Строка: ");
        String str = iScanner.nextLine();

        while (!str.equals("finish")) {
            if (!str.equals("dequeue") && !str.equals("first")) {
                enqueue(queue, str);
            } else if (str.equals("dequeue")) {
                dequeue(queue);
            } else if (str.equals("first")) {
                first(queue);
            }
            System.out.print("Строка: ");
            str = iScanner.nextLine();
        }
        iScanner.close();

        return queue;
    }

    static void enqueue(Queue<String> queue, String str) {
        queue.add(str);
    }

    static void dequeue(Queue<String> queue) {
        String str = queue.remove();
        System.out.println(str);
    }

    static void first(Queue<String> queue) {
        System.out.println(queue.element());
    }
}
