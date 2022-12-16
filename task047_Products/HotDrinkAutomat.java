package task047_Products;

import java.util.ArrayList;

public class HotDrinkAutomat extends DrinkAutomat {
    ArrayList<HotDrink> productsLst = new ArrayList<>();

    HotDrinkAutomat(Integer id, String name, Integer size) {
        super(id, name, size);
    }

    public void InitProducts(HotDrink[] product) {
        for (HotDrink el : product) {
            productsLst.add(el);
        }
    }

    public void getProduct(String name, Double valume, int temperature) {
        super.getProduct(name);
        for (int i = 0; i < productsLst.size(); i++) {
            if (productsLst.get(i).getName() == name && productsLst.get(i).getValume() == valume ) {
                System.out.println(productsLst.get(i));
            }
        }
    }
}
