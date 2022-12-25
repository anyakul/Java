package task049_Automat.services;

import task049_Automat.models.Order;
import task049_Automat.repository.OrderRepository;
import task049_Automat.view.GetOrderList;
import task049_Automat.view.GetProductsInOrder;

public class OrderServices {
    private final OrderRepository orderRepository;

    public OrderServices(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Функция получения view для отображения списка заказов
     * 
     * @return
     */
    public GetOrderList GetOrderList() {
        if (orderRepository.getOrdersList().isEmpty()) {
            return new GetOrderList(true, "Репозиторий заказов пустой", null);
        }
        return new GetOrderList(false, null, orderRepository.getOrdersList());
    }

    /**
     * Функция получения view для отображения списка продуктов в заказе
     * 
     * @param order
     * @return
     */
    public GetProductsInOrder getProductsInOrderList(Order order) {
        if (order.getProducts().isEmpty()) {
            return new GetProductsInOrder(true, "В заказе нет продуктов", null);
        }

        return new GetProductsInOrder(false, null, order.getProducts());
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }
}
