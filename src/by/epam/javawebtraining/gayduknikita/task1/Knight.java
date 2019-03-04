package by.epam.javawebtraining.gayduknikita.task1;


import by.epam.javawebtraining.gayduknikita.task1.controller.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalArmorValueException;
import by.epam.javawebtraining.gayduknikita.task1.util.collectioncreator.ArrayCollectionCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.ConsolePrinter;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.Printer;

public class Knight {

    public static void main(String[] args) {
        ArrayCollectionCreator collectionCreator = new ArrayCollectionCreator();
        BaseBag bag = new BaseBag(collectionCreator.factoryMethodRandomFill(30));
        Printer printer = new ConsolePrinter();


        printer.printArray(bag.getAll());
        System.out.println("\n\n\n");
        try {
            bag.searchByArmorValue(100, 200);
            printer.printArray(bag.searchByArmorValue(100, 200));
        } catch (IllegalArmorValueException e){
            System.out.println("Illegal armor value");
        }


    }
}