package task049_Automat.controllers;

import java.util.HashMap;
// import java.util.Scanner;

import task049_Automat.models.Automat;
import task049_Automat.models.Order;
import task049_Automat.models.Product;
import task049_Automat.repository.OrderRepository;
import task049_Automat.services.OrderServices;
import task049_Automat.view.GetOrderList;
import task049_Automat.view.GetProductsInOrder;

public class OrderController {
    private OrderServices orderServices;

    public OrderController(OrderServices orderServices) {
        this.orderServices = orderServices;
    }

    public void doOrder(Automat automat) {
        OrderRepository orderRepository = orderServices.getOrderRepository();
        // Scanner iScanner = new Scanner(System.in);
        Order order = new Order(automat);
        HashMap<Product, Integer> productsCol = automat.getProductsList();
        int[] productNums = new int[] { 5, 3, 3, 2, 6, 4, 4, 3, 7, 8, 9, 1, 1, 1, 1, 8, 7, 2, 5 };

        for (int num : productNums) {
            Product productThing = automat.getProductById(num);
            System.out.println(productThing);

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
            orderRepository.addOrder(order);
            System.out.println("Заказ успешно отправлен. Это ваш список заказов. Наберите код чтобы посмотреть.");
            GetOrderList getOrderList = orderServices.GetOrderList();
            StringBuilder message = getOrderList.PrintOrderList();
            System.out.println(message);
            GetProductsInOrder getProductsInAutomatList = orderServices
                    .getProductsInOrderList(orderRepository.getOrderByCode(order.getCode()));
            message = getProductsInAutomatList.PrintProductsInAutomatList();

            System.out.println(message);
        }
    }

    public OrderServices getOrderServices() {
        return orderServices;
    }
}
