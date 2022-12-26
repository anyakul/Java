package task048_Automat.models;

import java.util.HashMap;

public class Order {
    private final Integer id;
    private final int code;
    private HashMap<Product, Integer> productsList = new HashMap<>();
    private final Automat automat;
    protected static int defaultIndex = 1;

    /**
     * Конструктор
     * 
     * @param automat
     */
    public Order(Automat automat) {
        this.id = defaultIndex++;
        int min = 100;
        int max = 1000;
        this.code = (int) ((Math.random() * ++max) + min);
        this.automat = automat;
    }

    /**
     * Функция добавления продукта в заказ
     * 
     * @param product
     * @param count
     */
    public void AddProduct(Product product, Integer count) {
        productsList.put(product, count);
    }

    public final Integer getId() {
        return id;
    }

    public final int getCode() {
        return code;
    }

    public final Automat getAutomat() {
        return automat;
    }

    public final HashMap<Product, Integer> getProducts() {
        return productsList;
    }
}
