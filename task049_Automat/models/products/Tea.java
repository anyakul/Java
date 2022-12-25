package task049_Automat.models.products;

public class Tea extends HotDrinkProduct {
    /**
     * Конструктор
     * 
     * @param name
     * @param price
     * @param valume
     * @param temperature
     */
    public Tea(String name, Integer price, Double valume, Integer temperature) {
        super(name, price, valume, temperature);
    }
}
