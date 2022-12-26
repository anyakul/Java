package task048_Automat.models.products;

public class Drink extends DrinkSnackProduct {
    private Double valume;

    /**
     * Конструктор
     * 
     * @param name
     * @param price
     * @param valume
     */
    public Drink(String name, Integer price, Double valume) {
        super(name, price);
        this.valume = valume;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, стоит %s, объёмом %s", id, name, price, valume);
    }

    public Double getValume() {
        return valume;
    }
}
