public class BadOperatorException extends Exception{
    char opr;

    public BadOperatorException(char opr) {
        this.opr = opr;
    }

    @Override
    public String toString() {
        return "BadOperatorException{" +
                "opr=" + opr +
                '}';
    }
}
