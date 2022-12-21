package task049_Automat.services;

import java.util.HashMap;

import task049_Automat.models.Automat;
import task049_Automat.models.Product;
import task049_Automat.repository.AutomatRepository;
import task049_Automat.view.GetAutomatsList;
import task049_Automat.view.GetProductsInAutomat;

public class AutomatServices {
    private final AutomatRepository automatRepository;

    public AutomatServices(AutomatRepository automatRepository) {
        this.automatRepository = automatRepository;
    }
    public GetAutomatsList GetAutomatsList() {
        if (automatRepository.getAutomatsList().isEmpty()) {
            return new GetAutomatsList(true, "Репозиторий торговых аппаратов пустой", null);
        }
        return new GetAutomatsList(false, null, automatRepository.getAutomatsList());
    }

    public GetProductsInAutomat getProductsInAutomat(Automat automat) {
        HashMap<Product, Integer> products = automat.getProductsList();

        if (products.isEmpty()) {
            return new GetProductsInAutomat(true, "В заказе нет товаров. Добавьте", null);
        }

        return new GetProductsInAutomat(false, null, products);
    }

    public AutomatRepository getAutomatRepository() {
        return automatRepository;
    }
}
