package by.epam.recording.exception;

/**
 * Created by Acer on 21.02.2017.
 */
public class RecordingException extends Exception {
    public RecordingException() {
    }
    public RecordingException(String message, Throwable exception) {

        super(message,exception);
    }
    public RecordingException(String message) {

        super(message);
    }
    public RecordingException(Throwable exception) {

        super(exception);
    }
}
