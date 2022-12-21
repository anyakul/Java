package task049_Automat.models;

import java.util.HashMap;
import java.util.Random;

public class Order {
    private Integer id;
    private int code;
    private HashMap<Product, Integer> products = new HashMap<>();
    private Automat automat;
    protected static int defaultIndex = 1;

    public Order(Automat automat) {
        Random rand = new Random();
        this.id = defaultIndex++;
        this.code = rand.nextInt(100, 1000);
        this.automat = automat;
    }

    public Integer getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public Automat getAutomat() {
        return automat;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void AddProduct(Product product, Integer count) {
        products.put(product, count);
    }
}
