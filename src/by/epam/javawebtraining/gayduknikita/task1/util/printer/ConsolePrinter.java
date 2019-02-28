package by.epam.javawebtraining.gayduknikita.task1.util.printer;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

public class ConsolePrinter implements Printer {
    @Override
    public void printArray(BaseEquipment[] array) {
        for (BaseEquipment equip : array) {
            if (equip == null) {
                System.out.println("Empty \n");
            } else {
                System.out.println(equip.toString() + "\n");
            }
        }
    }
}
