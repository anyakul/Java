package task049_Automat.view;

import java.util.ArrayList;

import task049_Automat.models.Order;

public class GetOrderList extends View {
    protected ArrayList<Order> orders;

    public GetOrderList(boolean error, String errorMessage, ArrayList<Order> orders) {
        super(error, errorMessage);
        this.orders = orders;
    }

    public StringBuilder PrintOrderList() {
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (Order el : orders) {
                res.append(el.getId() + " " + el.getCode() + "\n");
            }
        }

        return res;
    }
}
