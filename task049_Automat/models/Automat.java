package task049_Automat.models;

import java.util.HashMap;

public abstract class Automat {
    protected final Integer id;
    protected String name;
    protected Integer size;
    protected static int defaultIndex = 1;
    protected HashMap<Product, Integer> productsList = new HashMap<>();

    /**
     * Конструктор
     * 
     * @param name
     * @param size
     */
    public Automat(String name, Integer size) {
        this.id = defaultIndex++;
        this.name = name;
        this.size = size;
    }

    /**
     * Функция добавления продукта в автомат
     * 
     * @param product
     * @param num
     */
    public final void AddProduct(Product product, int num) {
        if (productsList.size() < size && num != 0) {
            productsList.put(product, num);
        }
    }

    /**
     * Функция нахождения товара в торговом автомате по id
     * 
     * @param id
     * @return
     */
    public final Product getProductById(int id) {
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

    public final String getName() {
        return name;
    }

    public final Integer getSize() {
        return size;
    }

    public final HashMap<Product, Integer> getProductsList() {
        return productsList;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setSize(Integer size) {
        this.size = size;
    }
}
