package task047_Products;

public class HotDrink extends Drink {
    int temperature;

    public HotDrink(Integer id, String name, Integer price, Double valume, Integer temperature) {
        super(id, name, price, valume);
        this.valume = valume;
    }

    @Override
    public String toString() {
        String res = String.format("id: %d, name: %s, price: %s rub, valume: %s, temperature: %s ", id, name, price, valume, temperature);

        return res;
    }

    public int getTemperature() {
        return temperature;
    }
}
