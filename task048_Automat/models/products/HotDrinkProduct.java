package task048_Automat.models.products;

import task048_Automat.models.Product;

public class HotDrinkProduct extends Product {
    protected int temperature;
    protected double valume;

    /**
     * Конструктор
     * 
     * @param name
     * @param price
     * @param valume
     * @param temperature
     */
    public HotDrinkProduct(String name, Integer price, Double valume, Integer temperature) {
        super(name, price);
        this.valume = valume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String res = String.format("%s - %s, стоит %s, объёмом %s. Температура напитка %s", id, name,
                price, valume, temperature);

        return res;
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public double getValume() {
        return valume;
    }
}
