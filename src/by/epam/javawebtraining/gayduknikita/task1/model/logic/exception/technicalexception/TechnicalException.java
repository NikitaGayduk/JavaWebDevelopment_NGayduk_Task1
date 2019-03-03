package by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.technicalexception;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.KnightEquipmentException;

public class TechnicalException extends KnightEquipmentException {

    public TechnicalException() {
    }

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
    }
}
