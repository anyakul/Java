package examples.example005_Matrix;

public class program {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5]; // или int[][] arr = new int[3][5];

        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }
    }
}
