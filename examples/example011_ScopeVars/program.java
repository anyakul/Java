package examples.example011_ScopeVars;

public class program {
    public static void main(String[] args) {
        {
            int i = 234;
            System.out.println(i);
        }
        int a = 123;
        System.out.println(a);
        // System.out.println(i); error: cannot find symbol
    }
}
