package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCollectionTest {
    private ArrayCollection equipArray = new ArrayCollection(3);
    private BaseEquipment equip1 = new BaseEquipment(10, BaseEquipment.WearDegree.UNBROKEN);
    private BaseEquipment equip2 = new BaseEquipment(20, BaseEquipment.WearDegree.UNBROKEN);
    private BaseEquipment equip3 = new BaseEquipment(30, BaseEquipment.WearDegree.UNBROKEN);

    @Before
    public void setEquipArray() {
        equipArray = new ArrayCollection(3);
    }

    @Test
    public void addOutOfBoundsTest() {
        equipArray.add(equip1);
        equipArray.add(equip2);
        equipArray.add(equip3);
        assertFalse(equipArray.add(new BaseEquipment()));
    }

    @Test
    public void addOnTest() {
        equipArray.addOn(1, equip1);
        assertNull(equipArray.get(0));
        assertNotNull(equipArray.get(1));
        assertNull(equipArray.get(2));
    }

    @Test
    public void addOnOutOfBoundsTest() {
        assertFalse(equipArray.addOn(-1,equip1));
        assertFalse(equipArray.addOn(3,equip1));
    }


    @Test
    public void getTest() {
        equipArray.addOn(1, equip1);
        assertEquals(equip1, equipArray.get(1));
    }

    @Test
    public void getNullValueTest() {
        assertNull(equipArray.get(0));
    }

    @Test
    public void getAllTest() {
        BaseEquipment[] result = {equip1, null, equip3};
        equipArray.add(equip1);
        equipArray.add(null);
        equipArray.add(equip3);
        assertArrayEquals(result, equipArray.getAll());
    }

    @Test
    public void getSizeTest() {
        assertEquals(0, equipArray.getSize());
    }

    @Test
    public void removeTest() {
        BaseEquipment[] result = {equip1, equip3, null};
        equipArray.add(equip1);
        equipArray.add(equip2);
        equipArray.add(equip3);
        equipArray.remove(1);
        assertArrayEquals(result, equipArray.getAll());
    }

    @Test
    public void removeOutOfBoundsTest() {
        assertFalse(equipArray.remove(-1));
        assertFalse(equipArray.remove(3));
    }

    @Test
    public void removeNullValueTest() {
        assertFalse(equipArray.remove(0));
    }
}