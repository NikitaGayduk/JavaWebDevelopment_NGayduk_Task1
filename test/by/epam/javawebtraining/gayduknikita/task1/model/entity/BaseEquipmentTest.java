package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEquipmentTest {

    @Test
    public void parameterizedConstructorTest(){
        BaseEquipment equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(10,equip.getPrice());
        assertEquals(BaseEquipment.WearDegree.UNBROKEN, equip.getEquipmentState());
    }

    @Test
    public void setPriceTest() {
        BaseEquipment equip = new BaseEquipment();
        equip.setPrice(10);
        assertEquals(10,equip.getPrice());
    }

    @Test
    public void getPriceTest() {
        BaseEquipment equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(10,equip.getPrice());
    }

    @Test
    public void setEquipmentStateTest() {
        BaseEquipment equip = new BaseEquipment();
        equip.setEquipmentState(BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(BaseEquipment.WearDegree.UNBROKEN,equip.getEquipmentState());
    }

    @Test
    public void getEquipmentStateTest() {
        BaseEquipment equip = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(BaseEquipment.WearDegree.UNBROKEN,equip.getEquipmentState());
    }

    @Test
    public void equalsTest() {
        BaseEquipment equip1 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        BaseEquipment equip2 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(true, equip1.equals(equip2));
    }

    @Test
    public void compareToTest() {
        BaseEquipment equip1 = new BaseEquipment(20, BaseEquipment.WearDegree.UNBROKEN);
        BaseEquipment equip2 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
        assertEquals(1,equip1.compareTo(equip2));
    }
}