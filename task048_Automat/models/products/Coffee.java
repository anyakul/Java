package task048_Automat.models.products;

public class Coffee extends HotDrinkProduct {
    /**
     * Конструктор
     * 
     * @param name
     * @param price
     * @param valume
     * @param temperature
     */
    public Coffee(String name, Integer price, Double valume, Integer temperature) {
        super(name, price, valume, temperature);
    }
}
