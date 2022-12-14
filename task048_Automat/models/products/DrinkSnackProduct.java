package task048_Automat.models.products;

import task048_Automat.models.Product;

public class DrinkSnackProduct extends Product {
    /**
     * Конструктор
     * 
     * @param name
     * @param price
     */
    public DrinkSnackProduct(String name, Integer price) {
        super(name, price);
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(price);
    }
}
