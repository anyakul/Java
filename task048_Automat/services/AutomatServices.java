package task048_Automat.services;

import task048_Automat.models.Automat;
import task048_Automat.models.Product;
import task048_Automat.repository.AutomatRepository;
import task048_Automat.view.GetAutomatsList;
import task048_Automat.view.GetProductsInAutomat;

public class AutomatServices {
    private final AutomatRepository automatRepository;

    /**
     * Конструктор
     * 
     * @param automatRepository
     */
    public AutomatServices(AutomatRepository automatRepository) {
        this.automatRepository = automatRepository;
    }

    /**
     * Функция получения view для отображения списка торговых автоматов
     * 
     * @return
     */
    public GetAutomatsList GetAutomatsList() {
        if (automatRepository.getAutomatsList().isEmpty()) {
            return new GetAutomatsList(true, "Репозиторий торговых аппаратов пустой", null);
        }
        return new GetAutomatsList(false, null, automatRepository.getAutomatsList());
    }

    /**
     * Функция получения view для отображения списка продуктов в торговом автомате
     * 
     * @param automat
     * @return
     */
    public GetProductsInAutomat getProductsInAutomat(Automat automat) {
        if (automat.getProductsList().isEmpty()) {
            return new GetProductsInAutomat(true, "В торговом автомате нет товаров. Добавьте", null);
        }

        return new GetProductsInAutomat(false, null, automat.getProductsList());
    }

    /**
     * Функция поиска лучшего продукта в автомате
     * 
     * @param automat
     * @return
     */
    public Product getBestProduct(Automat automat) {
        Product bestProduct = automat.getProductById(0);

        for (var el : automat.getProductsList().entrySet()) {
            if (bestProduct == null) {
                bestProduct = el.getKey();
            } else {
                if (el.getKey().compareTo(bestProduct) == -1) {
                    bestProduct = el.getKey();
                }
            }
        }

        return bestProduct;
    }

    public AutomatRepository getAutomatRepository() {
        return automatRepository;
    }
}
