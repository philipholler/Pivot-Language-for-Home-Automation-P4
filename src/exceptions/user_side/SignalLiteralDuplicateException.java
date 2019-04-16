package exceptions.user_side;

public class SignalLiteralDuplicateException extends CompileErrorException {

    public SignalLiteralDuplicateException(String msg, int lineNumber) {
        super(msg, lineNumber);
    }

    public SignalLiteralDuplicateException(String msg) {
        super(msg);
    }
}
