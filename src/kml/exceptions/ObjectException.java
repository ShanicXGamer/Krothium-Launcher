package kml.exceptions;

/**
 * @website https://krothium.com
 * @author DarkLBP
 */

public class ObjectException extends Exception{
    public ObjectException() {}
    public ObjectException(final String message){super(message);}
    public ObjectException(final String message, final Throwable cause){super(message, cause);}
    public ObjectException(final Throwable cause){super(cause);}
}
