package examples.example018_InnerFor;

public class program {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
