package task047_Products;

import java.util.ArrayList;

public class DrinkAutomat extends Automat {
    ArrayList<Drink> productsLst = new ArrayList<>();

    DrinkAutomat(Integer id, String name, Integer size) {
        super(id, name, size);
    }

    public void InitProducts(Drink[] product) {
        for (Drink el : product) {
            productsLst.add(el);
        }
    }

    public void getProduct(String name, Double valume) {
        super.getProduct(name);
        for (int i = 0; i < productsLst.size(); i++) {
            if (productsLst.get(i).getName() == name && productsLst.get(i).getValume() == valume) {
                System.out.println(productsLst.get(i));
            }
        }
    }
}
