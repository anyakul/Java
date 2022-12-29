package task047_PizzaAutomat.controller;

import task047_PizzaAutomat.data.Dough;
import task047_PizzaAutomat.services.DoughServices;

public class VendingMachineController {
    private DoughServices doughServices;

    public VendingMachineController(DoughServices doughServices) {
        this.doughServices = doughServices;
    }

    public Dough getDough(String name) {
        return new Dough(name, 100);
    }

    public DoughServices getDoughServices() {
        return doughServices;
    }
}
