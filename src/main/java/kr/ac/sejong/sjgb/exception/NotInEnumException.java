package kr.ac.sejong.sjgb.exception;

public class NotInEnumException extends RuntimeException {
    public NotInEnumException() {
        super();
    }

    public NotInEnumException(String message) {
        super(message);
    }

    public NotInEnumException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotInEnumException(Throwable cause) {
        super(cause);
    }

    protected NotInEnumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
