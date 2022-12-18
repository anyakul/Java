package task047_Products;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    protected Integer id;
    protected Integer size;
    protected String name;
    protected static int defaultIndex = 0;
    protected ArrayList<Product> productsLst = new ArrayList<>();

    public Automat(String name, Integer size) {
        this.id = defaultIndex++;
        this.name = name;
        this.size = size;
    }

    public void InitProducts(Product[] product) {
        for (Product el : product) {
            if (productsLst.size() < size) {
                productsLst.add(el);
            }
        }
    }

    public Product getProduct(String name) {
        for (Product p : productsLst) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String res = String.format("id: %d, name: %s, size: %s", id, name, size);

        return res;
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

    public List<Product> getProductsLst() {
        return productsLst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
