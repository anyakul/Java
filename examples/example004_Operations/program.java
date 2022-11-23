package examples.example004_Operations;

public class program {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(a); // 123
        a++;
        System.out.println(a++); // 124
        System.out.println(a); // 125

        a = a-- - --a;
        System.out.println(a); // 2

        boolean f = 123 > 234;
        System.out.println(f); // false

        int b = 8;
        // 10010
        b = b << 1;
        System.out.println(b); // 10000

        int c = 18;
        // 10010
        c = c >> 1;
        System.out.println(c); // 1001

        int d = 5;
        int g = 2;
        System.out.println(d | g); // 101 7
        System.out.println(d ^ g); // 111 7

        String h = "qwe1"; // 4, 0..3
        boolean j = h.length() <= 5 && h.charAt(3) == '1';
        boolean k = h.length() <= 5 & h.charAt(3) == '1';
        boolean l = h.length() <= 5 || h.charAt(3) == '1'; // смотрит одну часть
        boolean m = h.length() <= 5 | h.charAt(3) == '1'; // смотрит обе части
        System.out.println(j); // true
        System.out.println(k); // true
        System.out.println(l); // true
        System.out.println(m); // true
    }
}
