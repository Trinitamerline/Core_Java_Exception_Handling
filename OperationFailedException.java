public class OperationFailedException extends Exception{
    String des;

    public OperationFailedException(String des) {
        this.des = des;
    }

    public OperationFailedException(Throwable cause, String des) {
        super(cause);
        this.des = des;
    }

    @Override
    public String toString() {
        return "OperationFailedException{" +
                "des='" + des + '\'' +
                '}';
    }
}
