package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.calculatebehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;

public class CostCalculateBehavior implements CalculateBehavior {

    public int calculate(BaseBag container) {
        int summaryCost = 0;

        for (int ptr = 0; ptr < container.getSize(); ptr++) {
            if (container.get(ptr) != null) {
                summaryCost += container.get(ptr).getPrice();
            }
        }
        return summaryCost;
    }
}
