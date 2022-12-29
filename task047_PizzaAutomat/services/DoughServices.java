package task047_PizzaAutomat.services;

import task047_PizzaAutomat.data.Dough;
import task047_PizzaAutomat.repository.DoughRepository;
import task047_PizzaAutomat.view.GetDoughByNameResponse;

public class DoughServices {
    private final DoughRepository doughRepository;

    public DoughServices(DoughRepository doughRepository) {
        this.doughRepository = doughRepository;
    }

    public GetDoughByNameResponse getDoughByNameResponse(String name) {
        Dough dough = doughRepository.getDoughByName(name);

        if (dough == null) {
            return new GetDoughByNameResponse(true, "Такой вид теста не найден", null);
        }

        return new GetDoughByNameResponse(false, null, dough);
    }

    public Boolean addDough(Dough dough) {
        return doughRepository.addDough(dough);
    }
}
