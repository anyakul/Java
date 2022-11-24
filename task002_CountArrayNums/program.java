package task002_CountArrayNums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class program {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1, 1};
        int count = 0;
        ArrayList<Integer> countArr = new ArrayList<Integer>(); 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else if (arr[i] == 0) {
                countArr.add(count);
                count = 0;
            }
        }
        IntStream intStream = Arrays.stream(arr);
        OptionalInt optionalInt = intStream.max();
    }
}
