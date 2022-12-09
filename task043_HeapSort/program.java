/* 43. Реализовать алгоритм пирамидальной сортировки (HeapSort). */

package task043_HeapSort;

import java.util.Arrays;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        int[] lst = GetRandomArray(count);
        System.out.println(Arrays.toString(lst));
        heapSort(lst);
        System.out.println(Arrays.toString(lst));
    }

    static int[] GetRandomArray(int count) {
        int[] lst = new int[count];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            lst[i] = rand.nextInt(100);
        }

        return lst;
    }

    private static int LEFT(int i) {
        return (2 * i + 1);
    }

    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    private static void swap(int[] sortArr, int i, int j) {
        int swap = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = swap;
    }

    private static void heapify(int[] sortArr, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;

        if (left < size && sortArr[left] > sortArr[i]) {
            largest = left;
        }
        if (right < size && sortArr[right] > sortArr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(sortArr, i, largest);
            heapify(sortArr, largest, size);
        }
    }

    public static int pop(int[] sortArr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = sortArr[0];

        sortArr[0] = sortArr[size - 1];
        heapify(sortArr, 0, size - 1);

        return top;
    }

    public static void heapSort(int[] sortArr) {
        int n = sortArr.length;
        int i = (n - 2) / 2;

        while (i >= 0) {
            heapify(sortArr, i--, n);
        }

        while (n > 0) {
            sortArr[n - 1] = pop(sortArr, n);
            n--;
        }
    }
}
