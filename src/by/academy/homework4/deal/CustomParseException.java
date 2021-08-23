package by.academy.homework4.deal;

public class CustomParseException extends Exception{
    private static final long serialVersionUID = -1L;
    public CustomParseException(String message) {
        super(message);
    }

    public CustomParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomParseException(Throwable cause) {
        super(cause);
    }

    public CustomParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
