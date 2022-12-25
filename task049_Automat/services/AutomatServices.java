package task049_Automat.services;

import task049_Automat.models.Automat;
import task049_Automat.repository.AutomatRepository;
import task049_Automat.view.GetAutomatsList;
import task049_Automat.view.GetProductsInAutomat;

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
            return new GetProductsInAutomat(true, "В заказе нет товаров. Добавьте", null);
        }

        return new GetProductsInAutomat(false, null, automat.getProductsList());
    }

    public AutomatRepository getAutomatRepository() {
        return automatRepository;
    }
}
