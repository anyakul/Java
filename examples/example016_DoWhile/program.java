package examples.example016_DoWhile;

public class program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }
}
