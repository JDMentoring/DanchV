package ua.smartprog.bankProject.dao;

public class DAOownException extends Exception {
    public DAOownException() {

    }

    public DAOownException(String message) {
        super(message);
    }

    public DAOownException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOownException(Throwable cause) {
        super(cause);
    }

    protected DAOownException(String message, Throwable cause,
                              boolean enableSuppression,
                              boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
