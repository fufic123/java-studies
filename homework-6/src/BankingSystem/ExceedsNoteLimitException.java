package BankingSystem;

public class ExceedsNoteLimitException extends RuntimeException {
    public ExceedsNoteLimitException(String message) {
        super(message);
    }
}
