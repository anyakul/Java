package examples.example058_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class program {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 2, 4, 5, 6, 3 };
        HashSet<Integer> myHashSet = getHashSet(arr);
        LinkedHashSet<Integer> myLinkedHashSet = getLinkedHashSet(arr);
        TreeSet<Integer> myTreeSet = getTreeSet(arr);
        System.out.println(myHashSet);
        System.out.println(myLinkedHashSet);
        System.out.println(myTreeSet);
    }

    static HashSet<Integer> getHashSet(int[] arr) {
        HashSet<Integer> res = new HashSet<>();

        for (int el : arr) {
            res.add(el);
        }

        return res;
    }

    static LinkedHashSet<Integer> getLinkedHashSet(int[] arr) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();

        for (int el : arr) {
            res.add(el);
        }

        return res;
    }

    static TreeSet<Integer> getTreeSet(int[] arr) {
        TreeSet<Integer> res = new TreeSet<>();

        for (int el : arr) {
            res.add(el);
        }

        return res;
    }
}
