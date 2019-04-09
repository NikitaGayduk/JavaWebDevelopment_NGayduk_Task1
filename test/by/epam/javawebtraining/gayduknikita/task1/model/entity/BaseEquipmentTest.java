package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalPriceException;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEquipmentTest {
    private BaseEquipment equip;
    private BaseEquipment equip1;
    private BaseEquipment equip2;

    @Test
    public void parameterizedConstructorTest(){
        equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(10,equip.getPrice());
        assertEquals(BaseEquipment.WearDegree.UNBROKEN, equip.getEquipmentState());
    }

    @Test
    public void setPriceTest() throws IllegalPriceException {
        equip = new BaseEquipment();
        equip.setPrice(10);
        assertEquals(10,equip.getPrice());
    }

    @Test
    public void getPriceTest() {
        equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(10,equip.getPrice());
    }

    @Test
    public void setEquipmentStateTest() {
        equip = new BaseEquipment();
        equip.setEquipmentState(BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(BaseEquipment.WearDegree.UNBROKEN,equip.getEquipmentState());
    }

    @Test
    public void getEquipmentStateTest() {
        equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(BaseEquipment.WearDegree.UNBROKEN,equip.getEquipmentState());
    }

    @Test
    public void equalsTest() {
        equip1 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        equip2 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(equip1, equip2);
    }

    @Test
    public void compareToTest() {
        equip1 = new BaseEquipment(20, BaseEquipment.WearDegree.UNBROKEN);
        equip2 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(1,equip1.compareTo(equip2));
    }
}