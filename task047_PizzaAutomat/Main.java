package task047_PizzaAutomat;

import task047_PizzaAutomat.controller.VendingMachineController;
import task047_PizzaAutomat.data.Dough;
import task047_PizzaAutomat.repository.DoughRepository;
import task047_PizzaAutomat.services.DoughServices;

public class Main {
    public static void main(String[] args) {
        DoughRepository doughRepository = new DoughRepository();
        doughRepository.addDough(new Dough("тесто", 10));
        DoughServices doughServices = new DoughServices(doughRepository);
        VendingMachineController vendingMachineController = new VendingMachineController(doughServices);

        System.out.println(vendingMachineController.getDough("тесто 1"));
    }
}
