package task048_PizzaAutomat.data;

public class Dough {
    private String name;
    private int price = 1;

    public Dough(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
