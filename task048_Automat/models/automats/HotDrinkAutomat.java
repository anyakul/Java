package task048_Automat.models.automats;

import task048_Automat.models.Automat;
import task048_Automat.models.Product;
import task048_Automat.models.products.HotDrinkProduct;

public class HotDrinkAutomat extends Automat {
    /**
     * Конструктор
     * 
     * @param name
     * @param size
     */
    public HotDrinkAutomat(String name, Integer size) {
        super(name, size);
    }

    public Product getProduct(String name, Double valume, int temperature) {
        for (var p : productsList.entrySet()) {
            if (p instanceof HotDrinkProduct && p.getKey().getName().equals(name) && ((HotDrinkProduct) p.getKey()).getValume() == valume
                    && ((HotDrinkProduct) p.getKey()).getTemperature() == temperature) {
                return p.getKey();
            }
        }

        return null;
    }
}
