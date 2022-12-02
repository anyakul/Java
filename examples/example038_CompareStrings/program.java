/* 22. Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); */

package examples.example038_CompareStrings;

public class program {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
        CompareStrings("s1, s2 ", s1, s2); // true, true
        CompareStrings("s1, s3 ", s1, s3); // true, true
        CompareStrings("s1, s4 ", s1, s4); // true, true
        CompareStrings("s1, s5 ", s1, s5); // false, true
        CompareStrings("s1, s6 ", s1, s6); // false, true
        CompareStrings("s2, s3 ", s2, s3); // true, true
        CompareStrings("s2, s4 ", s2, s4); // true, true
        CompareStrings("s2, s5 ", s2, s5); // false, true
        CompareStrings("s2, s6 ", s2, s6); // false, true
        CompareStrings("s3, s4 ", s3, s4); // true, true
        CompareStrings("s3, s5 ", s3, s5); // false, true
        CompareStrings("s3, s6 ", s3, s6); // false, true
        CompareStrings("s4, s5 ", s4, s5); // false, true
        CompareStrings("s4, s6 ", s4, s6); // false, true
        CompareStrings("s5, s6 ", s5, s6); // false, true
    }

    static void CompareStrings(String args, String str1, String str2) {
        System.out.println(args);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
