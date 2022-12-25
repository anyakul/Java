package task049_Automat.models.products;

import task049_Automat.models.Product;

public class GameProduct extends Product {
    /**
     * Конструктор
     * 
     * @param name
     * @param price
     */
    public GameProduct(String name, Integer price) {
        super(name, price);
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(price);
    }
}
