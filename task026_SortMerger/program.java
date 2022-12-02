/* 26. Реализовать алгоритм сортировки слиянием */

package task026_SortMerger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> lst = GetRandomArray(count);
        System.out.println(lst);
      //  mergeSort(lst);
    }

    static ArrayList<Integer> GetRandomArray(int count) {
        ArrayList<Integer> lst = new ArrayList<>(count);
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int temp = rand.nextInt(20);
            lst.add(temp);
        }

        return lst;
    }
/*
    public static int[] mergeSort(ArrayList<Integer> lst) {
        int[] buffer1 = lst.copyOf(lst, lst.size());
        int[] buffer2 = new int[lst.size()];
        int[] result = System.arraycopy(buffer1, buffer2, 0, lst.size());
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }*/
}
