package lab4.exceptions;

public class UncheckedException extends RuntimeException{
    public UncheckedException(String description){
        super("UncheckedException " + description);
    }
}
