package task048_Automat.repository;

import java.util.ArrayList;

import task048_Automat.models.Automat;

public class AutomatRepository {
    private ArrayList<Automat> automatsList = new ArrayList<>();

    /**
     * Функция поиска торгового автомата по id
     * 
     * @param id
     * @return Automat
     */
    public Automat getAutomatById(int id) {
        for (Automat automat : automatsList) {
            if (automat.getId() == id) {
                return automat;
            }
        }

        return null;
    }

    /**
     * Функция добавления торгового автомата в репозиторий
     * 
     * @param automat
     * @return 
     */
    public boolean AddAutomat(Automat automat) {
        if (automatsList.contains(automat)) {
            return false;
        }
        automatsList.add(automat);
        return true;
    }

    public ArrayList<Automat> getAutomatsList() {
        return automatsList;
    }
}
