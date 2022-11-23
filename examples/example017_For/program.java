package examples.example017_For;

public class program {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // break
            }
            System.out.println(i);
        }
    }
}
