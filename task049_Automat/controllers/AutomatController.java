package task049_Automat.controllers;

import java.util.Scanner;

import task049_Automat.models.Automat;
import task049_Automat.repository.AutomatRepository;
import task049_Automat.services.AutomatServices;
import task049_Automat.view.GetAutomatsList;
import task049_Automat.view.GetProductsInAutomat;

public class AutomatController {
    private AutomatServices automatServices;

    public AutomatController(AutomatServices automatServices) {
        this.automatServices = automatServices;
    }

    public Automat getUserChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите один из следующих торговых аппаратов: \n");
        GetAutomatsList getAutomatsList = automatServices.GetAutomatsList();
        StringBuilder message = getAutomatsList.PrintAutomatList();
        System.out.println(message);
        int automatNum = scan.nextInt();
        AutomatRepository automatRepository = automatServices.getAutomatRepository();
        Automat automat = automatRepository.getAutomatById(automatNum);
        
        while (automat == null) {
            System.out.println("Выберите другой торговый автомат");
            automatNum = scan.nextInt();
            automat = automatRepository.getAutomatById(automatNum);
        }
        if (automat != null) {
            System.out.println("Сделайте заказ набирая цифру продукта. Чтобы закончить наберите finish");
            GetProductsInAutomat getProductsInAutomatList = automatServices.getProductsInAutomat(automat);
            message = getProductsInAutomatList.PrintProductsInAutomatList();
            System.out.println(message);
            scan.close();
        }

        return automat;
    }

    public AutomatServices getAutomatServices() {
        return automatServices;
    }
}
