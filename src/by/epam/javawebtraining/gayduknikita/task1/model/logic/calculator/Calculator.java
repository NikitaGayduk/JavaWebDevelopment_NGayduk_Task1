package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;

public class Calculator {
    public static int calculateCost(Collection collection) {
        int summaryCost = 0;
        for (int ptr = 0; ptr < collection.getSize(); ptr++){
            if(collection.get(ptr) != null){
                summaryCost += collection.get(ptr).getPrice();
            }
        }
        return summaryCost;
    }
}
