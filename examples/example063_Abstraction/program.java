package examples.example063_Abstraction;

public class program {
    public static void main(String[] args) {
        Fooo f1 = new Fooo();
        f1.value = 111;
        f1.printCount();

        Fooo f2 = new Fooo();
        f2.value = 222;
        //System.out.println(f2.value);
        f2.printCount();

        Fooo f3 = new Fooo();
        f3.value = 333;
        //System.out.println(f3.value);
        f3.printCount();

        Dooo d1 = new Dooo();
        d1.M();
    }
}
