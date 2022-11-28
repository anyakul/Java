package examples.example024_ApiStrings;

public class program {
    public static void main(String[] args) {
        String[] name = { "С", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КЛ.";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("", name));
        System.out.println(String.join("", "c", "е", "р", "г", "е", "й"));
    }
}
