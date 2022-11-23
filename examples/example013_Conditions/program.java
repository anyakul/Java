package examples.example013_Conditions;

public class program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;

        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        int min = a < b ? a : b;

        System.out.println(c);
        System.out.println(min);
    }
}
