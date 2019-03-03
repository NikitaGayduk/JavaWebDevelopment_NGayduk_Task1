package by.epam.javawebtraining.gayduknikita.task1.model.logic.exception;

public class KnightEquipmentException extends Exception {

    public KnightEquipmentException(){

    }

    public KnightEquipmentException(String message){
        super(message);
    }

    public KnightEquipmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public KnightEquipmentException(Throwable cause) {
        super(cause);
    }
}
