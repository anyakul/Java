package task047_PizzaAutomat.repository;

import java.util.ArrayList;

import task047_PizzaAutomat.data.Dough;

public class DoughRepository {
    ArrayList<Dough> doughs = new ArrayList<>();

    public Dough getDoughByName(String name) {
        for (Dough dough : doughs) {
            if (dough.getName().equals(name)) {
                return dough;
            }
        }

        return null;
    }

    public boolean addDough(Dough dough) {
        if (doughs.contains(dough)) {
            return false;
        }
        doughs.add(dough);
        return true;
    }
}
