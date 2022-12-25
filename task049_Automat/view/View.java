package task049_Automat.view;

public abstract class View implements ViewInterface {
    protected final boolean error;
    protected final String errorMessage;

    /**
     * Конструктор
     * 
     * @param error
     * @param errorMessage
     */
    public View(boolean error, String errorMessage) {
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public final String getErrorMessage() {
        return errorMessage;
    }

    public final boolean getError() {
        return error;
    }
}
