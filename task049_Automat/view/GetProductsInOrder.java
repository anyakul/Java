package task049_Automat.view;

import java.util.HashMap;

import task049_Automat.models.Product;

public class GetProductsInOrder extends View {
    protected HashMap<Product, Integer> products;

    public GetProductsInOrder(boolean error, String errorMessage, HashMap<Product, Integer> products) {
        super(error, errorMessage);
        this.products = products;
    }

    public void printList() {
        StringBuilder res = new StringBuilder();
        res.append("Список продуктов в заказе: \n");

        if (error) {
            res.append(errorMessage);
        } else {
            for (var el : products.entrySet()) {
                Product product = el.getKey();
                res.append(product.getName() + " " + product.getPrice() + "руб. " + el.getValue() + "шт." + "\n");
            }
        }

        System.out.println(res);
    }
}
