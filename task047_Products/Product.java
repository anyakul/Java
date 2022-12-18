package task047_Products;

public abstract class Product {
    protected Integer id;
    protected String name;
    protected Integer price;
    protected static int defaultIndex = 0;

    Product(String name, int price) {
        this.id = defaultIndex++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        String res = String.format("id: %d, name: %s, price: %s", id, name, price);

        return res;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
