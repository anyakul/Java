package task049_Automat.view;

import java.util.HashMap;

import task049_Automat.models.Product;

public class GetProductsInAutomat extends View {
    protected HashMap<Product, Integer> products;

    public GetProductsInAutomat(boolean error, String errorMessage, HashMap<Product, Integer> products) {
        super(error, errorMessage);
        this.products = products;
    }

    public void printList() {
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (var el : products.entrySet()) {
                res.append(el.getKey() + "\n");
            }
        }

        System.out.println(res);
    }
}
