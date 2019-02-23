package by.epam.javawebtraining.gayduknikita.task1;


import by.epam.javawebtraining.gayduknikita.task1.controller.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.util.collectioncreator.ArrayCollectionCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.ConsolePrinter;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.Printer;

public class Knight {

    public static void main(String[] args) {
        ArrayCollectionCreator collectionCreator = new ArrayCollectionCreator();
        BaseBag bag = new BaseBag(collectionCreator.factoryMethodRandomFill(20));
        Printer printer = new ConsolePrinter();


        printer.printArray(bag.getAll());
        System.out.println("\n\n\n");
        printer.printArray(bag.searchByArmorType());
        System.out.println("\n\n\n");
        printer.printArray(bag.searchByArmorValue(100, 150));


    }
}