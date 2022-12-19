package task048_PizzaAutomat.services;

import task048_PizzaAutomat.repository.DoughRepository;
import task048_PizzaAutomat.view.GetDoughByNameResponse;
import task048_PizzaAutomat.data.Dough;

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
