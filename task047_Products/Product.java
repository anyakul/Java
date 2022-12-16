package task047_Products;

public abstract class Product {
    public Integer id;
    public String name;
    public Integer price;

    Product(Integer id, String name, int price) {
        this.id = id;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
