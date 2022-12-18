package task047_Products;

public class HotDrink extends Drink {
    protected final int temperature;

    public HotDrink(String name, Integer price, Double valume, Integer temperature) {
        super(name, price, valume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String res = String.format("id: %d, name: %s, price: %s rub, valume: %s, temperature: %s ", id, name, price,
                valume, temperature);

        return res;
    }

    public int getTemperature() {
        return temperature;
    }
}
