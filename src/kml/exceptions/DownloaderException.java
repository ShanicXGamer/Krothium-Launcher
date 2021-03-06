package kml.exceptions;

/**
 * @website https://krothium.com
 * @author DarkLBP
 */

public class DownloaderException extends Exception{
    public DownloaderException() {}
    public DownloaderException(final String message){super(message);}
    public DownloaderException(final String message, final Throwable cause){super(message, cause);}
    public DownloaderException(final Throwable cause){super(cause);}
}
