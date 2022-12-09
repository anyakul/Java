/* 44. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. */

package task044_ChessQueen;

import java.util.HashMap;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        HashMap<Integer, Integer> lst = GetRandomArray();
        System.out.println(lst);
        GetChessField(lst);
    }

    static HashMap<Integer, Integer> GetRandomArray() {
        HashMap<Integer, Integer> lst = new HashMap<>();
        Random rand = new Random();
        int move = 0;
        int i = 0;

        while (move < 8) {
            int num = rand.nextInt(0, 8);
            while (lst.containsValue(num)) {
                num = rand.nextInt(0, 8);
                i += 1;
            }
            lst.put(move, num);
            move += 1;
        }

        return lst;
    }

    public static boolean checkDiagonal(HashMap<Integer, Integer> lst, int checkValue) {
        for (int i = checkValue; i < 8; i++) {
            if (lst.containsKey(i + 1) || lst.containsValue(i + 1)) {
                return true;
            }
        }
        return false;
    }

    static void GetChessField(HashMap<Integer, Integer> lst) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (lst.containsKey(i) && lst.get(i) == j) {
                    str.append("  F  ");
                } else {
                    str.append(" " + i + ":" + j + " ");
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
