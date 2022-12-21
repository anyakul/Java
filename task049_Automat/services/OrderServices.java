package task049_Automat.services;

import java.util.HashMap;

import task049_Automat.models.Order;
import task049_Automat.models.Product;
import task049_Automat.repository.OrderRepository;
import task049_Automat.view.GetOrderList;
import task049_Automat.view.GetProductsInOrder;

public class OrderServices {
    private final OrderRepository orderRepository;

    public OrderServices(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public GetOrderList GetOrderList() {
        if (orderRepository.getOrdersList().isEmpty()) {
            return new GetOrderList(true, "Репозиторий заказов пустой", null);
        }
        return new GetOrderList(false, null, orderRepository.getOrdersList());
    }

    public GetProductsInOrder getProductsInOrderList(Order order) {
        HashMap<Product, Integer> products = order.getProducts();

        return new GetProductsInOrder(false, null, products);
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }
}
