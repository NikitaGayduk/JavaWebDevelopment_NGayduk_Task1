package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.calculatebehavior.CalculateBehavior;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.calculatebehavior.PriceCalculateBehavior;

/**
 * @author NikitaGayduk
 * @date 24.03.2019
 */
public class BaseCalculator implements Calculator{
    private CalculateBehavior behavior = new PriceCalculateBehavior();

    @Override
    public int calculate(BaseBag container) {
        return behavior.calculate(container);
    }

    public void setBehavior(CalculateBehavior behavior){
        this.behavior = behavior;
    }
}
