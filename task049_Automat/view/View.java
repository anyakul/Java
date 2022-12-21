package task049_Automat.view;

public abstract class View implements ViewInterface {
    protected boolean error;
    protected String errorMessage;

    public View(boolean error, String errorMessage) {
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean getError() {
        return error;
    }
}
