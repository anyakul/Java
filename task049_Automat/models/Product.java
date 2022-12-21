package task049_Automat.models;

public abstract class Product {
    protected Integer id;
    protected String name;
    protected Integer price;
    protected static int defaultIndex = 1;

    public Product(String name, int price) {
        this.id = defaultIndex++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, стоит %s", id, name, price);
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
