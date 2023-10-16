package pkbanking.pkexception;

public class InsufficientFundsException extends Throwable {
    String description;

    public InsufficientFundsException() {
        description = "Insufficient Funds";
    }

    public InsufficientFundsException(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InsufficientFundsException{" +
                "description='" + description + '\'' +
                '}';
    }
}
