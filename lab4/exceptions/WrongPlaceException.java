package lab4.exceptions;

public class WrongPlaceException extends RuntimeException{
    public WrongPlaceException(String message) {
        super(message);
    }
}
