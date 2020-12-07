package lab4.exceptions;

public class CheckedException extends Exception {
    public CheckedException(String description){
        super("Checked " + description);
    }

}
