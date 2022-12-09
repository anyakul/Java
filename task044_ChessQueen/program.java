/* 44. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. */

package task044_ChessQueen;

import java.util.Random;

public class program {
    public static void main(String[] args) {
        String[][] lst = GetRandomArray();

        for (String[] row : lst) {
            printRow(row);
        }
    }

    public static void printRow(String[] row) {
        for (String i : row) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printboolean(boolean[] row) {
        for (boolean i : row) {
            System.out.print(i);
        }
        System.out.println();
    }

    static String[][] GetRandomArray() {
        boolean[][] boolArr = GetBoolArray();
        String[][] arr = new String[8][8];

        for (boolean[] row : boolArr) {
            printboolean(row);
        }

        for (int i = 0; i < 8; i++) {
            int num = getNum(boolArr, i);
            UpdateBoard(boolArr, i, num);
            for (int j = 0; j < 8; j++) {
                if (j == num) {
                    arr[i][j] = "  F  ";
                } else {
                    arr[i][j] = " " + i + ":" + j + " ";
                }
            }
        }

        return arr;
    }

    static int getNum(boolean[][] boolArr, int i) {
        Random rand = new Random();
        int num = rand.nextInt(8);
        boolean bool = boolArr[i][num];
        while (!bool) {
            bool = boolArr[i][num];
            num = rand.nextInt(8);
            bool = boolArr[i][num];

            if (bool) {
                break;
            }
        }


        return num;
    }

    static boolean[][] GetBoolArray() {
        boolean[][] boolArr = new boolean[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolArr[i][j] = true;
            }
        }

        return boolArr;
    }

    static void UpdateBoard(boolean[][] boolArr, int row, int col) {
        int r = row;
        int c = col;
        for (int j = 0; j < 8; j++) {
            boolArr[r][j] = false;
        }

        for (int j = 0; j < 8; j++) {
            boolArr[j][c] = false;
        }

        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            boolArr[r][c] = false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r < 8 && c < 8) {
            boolArr[r][c] = false;
            r++;
            c++;
        }

        r = row;
        c = col;
        while (r < 8 && c >= 0) {
            boolArr[r][c] = false;
            r++;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < 8) {
            boolArr[r][c] = false;
            r--;
            c++;
        }
    }
}
