package task048_PizzaAutomat;

import task048_PizzaAutomat.controller.VendingMachineController;
import task048_PizzaAutomat.data.Dough;
import task048_PizzaAutomat.repository.DoughRepository;
import task048_PizzaAutomat.services.DoughServices;

public class Main {
    public static void main(String[] args) {
        DoughRepository doughRepository = new DoughRepository();
        doughRepository.addDough(new Dough("тесто", 10));
        DoughServices doughServices = new DoughServices(doughRepository);
        VendingMachineController vendingMachineController = new VendingMachineController(doughServices);

        System.out.println(vendingMachineController.getDough("тесто 1"));
    }
}
