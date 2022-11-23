/*
 * Program
*/

package examples.example002_ImplicitTyping;

public class program {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        System.out.println(getType(a)); // integer
        var d = 123.456; // 123.456
        System.out.println(d); // 123.456
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
