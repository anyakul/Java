package task047_Products;

public class Drink extends Product {
    double valume;

    public Drink(Integer id, String name, Integer price, Double valume) {
        super(id, name, price);
        this.valume = valume;
    }

    @Override
    public String toString() {
        String res = String.format("id: %d, name: %s, price: %s rub, valume: %s", id, name, price, valume);

        return res;
    }

    public double getValume() {
        return valume;
    }
}
