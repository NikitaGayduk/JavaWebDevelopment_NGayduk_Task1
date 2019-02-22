package by.epam.javawebtraining.gayduknikita.task1;


import by.epam.javawebtraining.gayduknikita.task1.Controller.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.util.creator.ArmorCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.creator.BaseEquipmentCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.creator.Creator;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.ConsolePrinter;
import by.epam.javawebtraining.gayduknikita.task1.util.printer.Printer;

public class Knight {

    public static void main(String[] args) {
        Creator baseCreator = new BaseEquipmentCreator();
        Creator armorCreator = new ArmorCreator();
        Printer printer = new ConsolePrinter();

        BaseBag bag = new BaseBag(10);
        bag.add(armorCreator.factoryMethodRandomFill());

        printer.printArray(bag.getAll());

    }
}