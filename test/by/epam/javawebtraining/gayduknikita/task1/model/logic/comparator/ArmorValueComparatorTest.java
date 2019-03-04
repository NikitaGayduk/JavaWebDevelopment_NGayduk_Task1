package by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator;

import java.util.Arrays;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArmorValueComparatorTest {
    private ArmorValueComparator comparator = new ArmorValueComparator();
    private static BaseEquipment armorEquip1
            = new ArmorEquipment(10, BaseEquipment.WearDegree.UNBROKEN, 100);
    private static BaseEquipment armorEquip2
            = new ArmorEquipment(10, BaseEquipment.WearDegree.UNBROKEN, 200);
    private static BaseEquipment torsoArmor
            = new TorsoArmor(10, BaseEquipment.WearDegree.UNBROKEN, 300, 100, 100);


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, null, null},
                {1, armorEquip1, null},
                {-1, null, armorEquip1},
                {0, armorEquip1, armorEquip1},
                {1, armorEquip2, armorEquip1},
                {-1, armorEquip1, armorEquip2},
                {1, torsoArmor, armorEquip1},
                {-1, armorEquip1, torsoArmor},

        });
    }

    @Parameter(0)
    public int result;

    @Parameter(1)
    public ArmorEquipment equip1;

    @Parameter(2)
    public ArmorEquipment equip2;

    @Test
    public void compareTest() {
        assertEquals(result, comparator.compare(equip1, equip2));
    }

    @Test
    public void returnComparedClassesTest() {
        assertEquals(ArmorEquipment.class, comparator.returnComparedClasses());
    }


}