package task048_Automat.models.automats;

import task048_Automat.models.Automat;
import task048_Automat.models.Product;
import task048_Automat.models.products.Drink;

public class DrinkSnackAutomat extends Automat {
    /**
     * Конструктор
     * 
     * @param name
     * @param size
     */
    public DrinkSnackAutomat(String name, Integer size) {
        super(name, size);
    }

    public Product getProduct(String name, Double valume) {
        for (var p : productsList.entrySet()) {
            if (p.getKey() instanceof Drink && p.getKey().getName().equals(name) && ((Drink) p.getKey()).getValume() == valume) {
                return p.getKey();
            }
        }

        return null;
    }
}
