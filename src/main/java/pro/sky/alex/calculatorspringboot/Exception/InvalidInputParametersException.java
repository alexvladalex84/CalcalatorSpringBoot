package pro.sky.alex.calculatorspringboot.Exception;

public class InvalidInputParametersException extends RuntimeException {
    public InvalidInputParametersException(String message) {
        super(message);
    }
}
