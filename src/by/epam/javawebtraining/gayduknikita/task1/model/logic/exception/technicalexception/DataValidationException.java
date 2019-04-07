package by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.technicalexception;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */
public class DataValidationException extends TechnicalException {

    public DataValidationException() {
    }

    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidationException(Throwable cause) {
        super(cause);
    }
}
