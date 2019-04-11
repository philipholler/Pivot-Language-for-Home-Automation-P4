package exceptions.user_side;

public class SignalLiteralWrongTypeException extends CompileErrorException {

    public SignalLiteralWrongTypeException(String msg, int lineNumber) {
        super(msg, lineNumber);
    }

    public SignalLiteralWrongTypeException(String msg) {
        super(msg);
    }
}
