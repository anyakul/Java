package task049_Automat.view;

import java.util.ArrayList;

import task049_Automat.models.Order;

public class GetOrderList extends View {
    protected ArrayList<Order> orders;

    /**
     * Конструктор
     * 
     * @param error
     * @param errorMessage
     * @param orders
     */
    public GetOrderList(boolean error, String errorMessage, ArrayList<Order> orders) {
        super(error, errorMessage);
        this.orders = orders;
    }

    /**
     * Функции вывода списка торговых автоматов в репозитории
     */
    public void printList() {
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (Order el : orders) {
                res.append(el.getId() + " " + el.getCode() + "\n");
            }
        }

        System.out.println(res);
    }
}
