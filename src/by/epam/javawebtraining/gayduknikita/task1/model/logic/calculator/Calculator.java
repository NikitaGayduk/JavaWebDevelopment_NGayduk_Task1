package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

public class Calculator {
    public static int calculateCost(BaseEquipment[] collection) {
        int summaryCost = 0;

        for (int ptr = 0; ptr < collection.length; ptr++) {
            if (collection[ptr] != null) {
                summaryCost += collection[ptr].getPrice();
            }
        }

        return summaryCost;
    }
}
