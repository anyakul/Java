package task049_Automat.controllers;

import java.util.Scanner;

import task049_Automat.models.Automat;
import task049_Automat.models.Product;
import task049_Automat.repository.AutomatRepository;
import task049_Automat.services.AutomatServices;
import task049_Automat.view.GetAutomatsList;
import task049_Automat.view.GetProductsInAutomat;

public class AutomatController {
    private AutomatServices automatServices;
    private Automat automat;

    /**
     * Конструктор
     * 
     * @param automatServices
     */
    public AutomatController(AutomatServices automatServices) {
        this.automatServices = automatServices;
    }

    public Automat getUserChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите один из следующих торговых аппаратов: \n");
        GetAutomatsList getAutomatsList = automatServices.GetAutomatsList();
        getAutomatsList.printList();
        int automatNum = scan.nextInt();
        AutomatRepository automatRepository = automatServices.getAutomatRepository();
        automat = automatRepository.getAutomatById(automatNum);

        while (automat == null) {
            System.out.println("Выберите другой торговый автомат");
            automatNum = scan.nextInt();
            automat = automatRepository.getAutomatById(automatNum);
        }

        if (automat != null) {
            System.out.println("Сделайте заказ набирая цифру продукта. Чтобы закончить наберите finish");
            GetProductsInAutomat getProductsInAutomatList = automatServices.getProductsInAutomat(automat);
            getProductsInAutomatList.printList();
            scan.close();
        }

        return automat;
    }

    public AutomatServices getAutomatServices() {
        return automatServices;
    }

    /**
     * Метод сравнения двух продуктов
     * 
     * @param product1
     * @param product2
     */
    public void CompareTwoProducts(Product product1, Product product2) {
        if (product1.compareTo(product2) == 1) {
            System.out.println(product1 + " привлекательнее чем " + product2);
        }

        System.out.println(product2.getName() + " привлекательнее чем " + product1.getName());
    }

    /**
     * Метод вывода лучшего товара в торговом автомате
     */
    public void getBestProductInAutomat() {
        System.out.println("Лучший продукт в торговом автомате: " + automatServices.getBestProduct(automat));
    }
}
