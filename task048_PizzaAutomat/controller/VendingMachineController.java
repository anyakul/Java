package task048_PizzaAutomat.controller;

import task048_PizzaAutomat.data.Dough;
import task048_PizzaAutomat.services.DoughServices;

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
