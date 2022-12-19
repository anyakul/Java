package task048_PizzaAutomat.view;

import task048_PizzaAutomat.data.Dough;

public class GetDoughByNameResponse {
    private boolean error;
    private String errorMessage;
    private Dough dough;

    public GetDoughByNameResponse(boolean error, String errorMessage, Dough dough) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.dough = dough;
    }

    @Override
    public String toString() {
        String res = String.format("name: %s, price: %s",  dough.getName(), dough.getPrice());

        return res;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean getError() {
        return error;
    }
}
