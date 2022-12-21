package task049_Automat.models;

import java.util.HashMap;

public abstract class Automat {
    protected Integer id;
    protected String name;
    protected Integer size;
    protected static int defaultIndex = 1;
    protected HashMap<Product, Integer> productsList = new HashMap<>();

    public Automat(String name, Integer size) {
        this.id = defaultIndex++;
        this.name = name;
        this.size = size;
    }

    public void AddProduct(Product product, int num) {
        if (productsList.size() < size && num != 0) {
            productsList.put(product, num);
        }
    }

    public Product getProductById(int id) {
        for (var product : productsList.entrySet()) {
            if (product.getKey().getId() == id) {
                return product.getKey();
            }
        }

        return null;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public HashMap<Product, Integer> getProductsList() {
        return productsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
