package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.calculatebehavior.CostCalculateBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CostCalculateBehaviorTest {
    private BaseBag container = new BaseBag();
    private CostCalculateBehavior costCalculator = new CostCalculateBehavior();

    @Before
    public void setData() {
        container.add(new BaseEquipment(40, BaseEquipment.WearDegree.UNBROKEN));
        container.add(null);
        container.add(new ArmorEquipment(50, BaseEquipment.WearDegree.UNBROKEN, 300));
    }

    @Test
    public void calculateCostTest() {
        assertEquals(90, costCalculator.calculate(container));
    }
}