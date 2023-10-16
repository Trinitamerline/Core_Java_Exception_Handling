public class BadOperandException extends Exception{
    int op;

    public BadOperandException(int op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "BadOperandException{" +
                "op=" + op +
                '}';
    }
}
