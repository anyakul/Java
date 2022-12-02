/* 25. Реализовать алгоритм сортировки слиянием */

package task025_SortMerger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> lst = GetRandomArray(count);
        System.out.println(lst);
        List<Integer> sortLst = mergeSort(lst);
        System.out.println(sortLst);
    }

    static ArrayList<Integer> GetRandomArray(int count) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            arr.add(rand.nextInt(20));
        }

        return arr;
    }

    public static List<Integer> mergeSort(List<Integer> lst) {
        if (lst.size() <= 1) {
            return lst;
        }
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i < (lst.size()) / 2)
                left.add(lst.get(i));
            else {
                right.add(lst.get(i));
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> l, List<Integer> r) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (l.size() > 0 && r.size() > 0) {
            if (l.get(0) <= r.get(0)) {
                result.add(l.get(0));
                l.remove(0);
            } else {
                result.add(r.get(0));
                r.remove(0);
            }
        }
        while (l.size() > 0) {
            result.add(l.get(0));
            l.remove(0);
        }
        while (r.size() > 0) {
            result.add(r.get(0));
            r.remove(0);
        }

        return result;
    }
}
