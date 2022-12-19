package examples.example063_Abstraction;

public class Fooo {
    public Integer value;
    public static Integer count;

    public static Integer getCount() {
        return count;
    }

    static {
        count = 0;
    }
    

    public Fooo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
