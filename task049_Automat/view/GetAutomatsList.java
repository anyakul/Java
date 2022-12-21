package task049_Automat.view;

import java.util.ArrayList;

import task049_Automat.models.Automat;

public class GetAutomatsList extends View {
    protected ArrayList<Automat> automats;

    public GetAutomatsList(boolean error, String errorMessage, ArrayList<Automat> automats) {
        super(error, errorMessage);
        this.automats = automats;
    }

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
}
