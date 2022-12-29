package task048_Automat.view;

import java.util.ArrayList;

import task048_Automat.models.Automat;

public class GetAutomatsList extends View {
    private ArrayList<Automat> automats;

    /**
     * Конструктор
     * 
     * @param error
     * @param errorMessage
     * @param automats
     */

    public GetAutomatsList(boolean error, String errorMessage, ArrayList<Automat> automats) {
        super(error, errorMessage);
        this.automats = automats;
    }

    /**
     * Функции вывода списка торговых автоматов в репозитории
     */
    public void printList() {
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (Automat el : automats) {
                res.append(el.getId() + " " + el.getName() + "\n");
            }
        }

        System.out.println(res);
    }

    public ArrayList<Automat> getAutomats() {
        return automats;
    }
}
