package examples.example009_FormatInput;

public class program {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + "+" + b + "=" + c;
        System.out.println(res);

        String s = "qwe";
        int d = 123;
        String q = s + d;
        System.out.println(q);

        int f = 1, g = 2;
        int h = a + b;
        String res1 = String.format("%d + %d = %d \n", f, g, h);
        System.out.printf("%d + %d = %d \n", f, g, h);
        System.out.println(res1);
    }
}
