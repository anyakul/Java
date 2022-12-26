package task048_Automat.repository;

import java.util.ArrayList;

import task048_Automat.models.Order;

public class OrderRepository {
    private ArrayList<Order> ordersList = new ArrayList<>();

    /**
     * Функция поиска заказа по коду
     * 
     * @param code
     * @return Order
     */
    public Order getOrderByCode(Integer code) {
        for (Order order : ordersList) {
            if (order.getCode() == code) {
                return order;
            }
        }

        return null;
    }

    /**
     * Функция добавления заказа в репозиторий
     * 
     * @param order
     * @return
     */
    public boolean AddOrder(Order order) {
        if (ordersList.contains(order)) {
            return false;
        }
        ordersList.add(order);
        return true;
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }
}
