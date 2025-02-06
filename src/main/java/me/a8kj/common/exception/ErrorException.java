package me.a8kj.common.exception;

/**
 * ErrorException is a custom Exception used in pvp to trigger exceptions
 * 
 * @author A8kj7sea
 */
public class ErrorException extends Exception {
    private final Throwable cause;

    /**
     * Constructs a new ErrorException based on the given Exception
     *
     * @param throwable Exception that triggered this Exception
     */
    public ErrorException(Throwable throwable) {
        cause = throwable;
    }

    /**
     * Constructs a new ErrorException
     */
    public ErrorException() {
        cause = null;
    }

    /**
     * Constructs a new ErrorException with the given message
     *
     * @param cause   The exception that caused this
     * @param message The message
     */
    public ErrorException(Throwable cause, String message) {
        super(message);
        this.cause = cause;
    }

    /**
     * Constructs a new ErrorException with the given message
     *
     * @param message The message
     */
    public ErrorException(String message) {
        super(message);
        cause = null;
    }

    /**
     * If applicable, returns the Exception that triggered this Exception
     *
     * @return Inner exception, or null if one does not exist
     */
    @Override
    public Throwable getCause() {
        return cause;
    }
}
