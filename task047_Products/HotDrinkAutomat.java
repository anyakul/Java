package task047_Products;

public class HotDrinkAutomat extends DrinkAutomat {

    HotDrinkAutomat(String name, Integer size) {
        super(name, size);
    }

    public Product getProduct(String name, Double valume, int temperature) {
        for (Product p : productsLst) {
            if (p instanceof HotDrink && p.getName().equals(name) && ((HotDrink) p).getValume() == valume
                    && ((HotDrink) p).getTemperature() == temperature) {
                return p;
            }
        }

        return null;
    }
}
