package task048_Automat.controllers;

import java.util.HashMap;

import task048_Automat.models.Automat;
import task048_Automat.models.Order;
import task048_Automat.models.Product;
import task048_Automat.repository.OrderRepository;
import task048_Automat.services.OrderServices;
import task048_Automat.view.GetOrderList;
import task048_Automat.view.GetProductsInOrder;

public class OrderController {
    private OrderServices orderServices;
    private OrderRepository orderRepository;
    private Automat automat;

    public OrderController(OrderServices orderServices, Automat automat) {
        this.orderServices = orderServices;
        this.orderRepository = orderServices.getOrderRepository();
        this.automat = automat;
    }

    public void doOrder() {
        Order order = new Order(automat);
        HashMap<Product, Integer> productsCol = automat.getProductsList();
        int[] productNums = new int[] { 5, 3, 3, 2, 6, 4, 4, 3, 7, 8, 9, 1, 1, 1, 1, 8, 7, 2, 5 };

        for (int num : productNums) {
            Product productThing = automat.getProductById(num);

            if (productThing == null) {
                System.out.println("Такого продукта в торговом автомате нет. Выберите другой продукт.");
            } else {
                if (order.getProducts() != null && order.getProducts().containsKey(productThing)) {
                    if (order.getProducts().get(productThing) < productsCol.get(productThing)) {
                        order.AddProduct(productThing, order.getProducts().get(productThing) + 1);
                        System.out.println("Продукт успешно добавлен в заказ.");
                    } else {
                        System.out.println("Вы взяли максимальное количество этого товара. Выберите другой продукт");
                    }
                } else {
                    order.AddProduct(productThing, 1);
                    System.out.println("Продукт успешно добавлен в заказ.");
                }
            }
        }

        if (!order.getProducts().isEmpty()) {
            orderRepository.AddOrder(order);
            System.out.println("Заказ успешно отправлен. Это ваш список заказов. Наберите код чтобы посмотреть.");
            GetOrderList getOrderList = orderServices.GetOrderList();
            getOrderList.printList();
            GetProductsInOrder getProductsInAutomatList = orderServices
                    .getProductsInOrderList(order);
            getProductsInAutomatList.printList();
        } else {
            System.out.println("Заказ пустой");
        }

        // GetOrderByCode(order.getCode());
    }

    public void GetOrderByCode(int code) {
        if (orderRepository.getOrderByCode(code) != null) {
            GetProductsInOrder getProductsInAutomatList = orderServices
                    .getProductsInOrderList(orderRepository.getOrderByCode(code));
            getProductsInAutomatList.printList();
        }
    }

    public OrderServices getOrderServices() {
        return orderServices;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public Automat getAutomat() {
        return automat;
    }
}
