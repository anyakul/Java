package examples.example014_Switch;

public class program {
    public static void main(String[] args) {
        int a = 123;
        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println("a");
                break;
            case 4:
                System.out.println("b");
                break;
            default:
                break;
        }
    }
}
