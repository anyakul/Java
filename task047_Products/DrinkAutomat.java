package task047_Products;

public class DrinkAutomat extends Automat {
    DrinkAutomat(String name, Integer size) {
        super(name, size);
    }

    public Product getProduct(String name, Double valume) {
        for (Product p : productsLst) {
            if (p instanceof Drink && p.getName().equals(name) && ((Drink) p).getValume() == valume) {
                return p;
            }
        }

        return null;
    }
}
