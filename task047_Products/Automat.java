package task047_Products;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    private Integer id;
    private Integer size;
    private String name;
    protected ArrayList<Product> productsLst = new ArrayList<>();
    private static int defaultIndex = 0;

    public Automat(Integer id, String name, Integer size) {
        this.id = defaultIndex++;
        this.name = name;
        this.size = size;
    }

    public void InitProducts(Product[] product) {
        for (Product el : product) {
            productsLst.add(el);
        }
    }

    public void getProduct(String name) {
        for (int i = 0; i < productsLst.size(); i++) {
            if (productsLst.get(i).getName() == name) {
                System.out.println(productsLst.get(i));
            }
        }
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
