package examples.example001_DataTypes;

public class program {
    public static void main(String[] args) {
        String s = "2";
        short age = 10;
        int salary = 123456;
        double pi = 3.1415;
        float e = 2.7f;
        char ch = '1';
        char ch1 = 'a';
        boolean flag1 = 123 <= 234;
        boolean flag2 = 123 >= 234 || flag1;
        boolean flag3 = flag1 ^ flag2;

        System.out.println(s);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Character.isDigit(ch)); // true
        System.out.println(Character.isDigit(ch1)); // false
        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false
    }
}
