package by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    private final BaseEquipment[] array = new BaseEquipment[3];

    @Before
    public void setData() {
        array[0] = new BaseEquipment(40, BaseEquipment.WearDegree.UNBROKEN);
        array[1] = null;
        array[2] = new ArmorEquipment(50, BaseEquipment.WearDegree.UNBROKEN, 300);
    }

    @Test
    public void calculateCostTest() {
        assertEquals(90, Calculator.calculateCost(array));
    }
}