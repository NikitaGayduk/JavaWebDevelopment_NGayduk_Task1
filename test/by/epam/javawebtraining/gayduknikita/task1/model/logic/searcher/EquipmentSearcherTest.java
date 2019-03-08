package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.AbstractSearchBehavior;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.ArmorSearchBehavior;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentSearcherTest {
    private static EquipmentSearcher searcher = new EquipmentSearcher();
    private static AbstractSearchBehavior behavior = new ArmorSearchBehavior();
    private static Collection collection = new ArrayCollection(7);
    private static BaseEquipment[] searchByTypeResult = new BaseEquipment[4];
    private static BaseEquipment[] searchByArmorResult = new BaseEquipment[3];


    private static final BaseEquipment baseEquip
            = null;
    private static final BaseEquipment weaponEquip
            = new WeaponEquipment();
    private static final BaseEquipment cuttingWeaponEquip
            = new CuttingWeapon();
    private static final BaseEquipment armorEquip100
            = new ArmorEquipment(10, BaseEquipment.WearDegree.UNBROKEN, 100);
    private static final BaseEquipment armorEquip200
            = new ArmorEquipment(10, BaseEquipment.WearDegree.UNBROKEN, 200);
    private static final BaseEquipment torsoEquip200
            = new TorsoArmor(10, BaseEquipment.WearDegree.UNBROKEN, 200, 100, 100);
    private static final BaseEquipment torsoEquip300
            = new TorsoArmor(10, BaseEquipment.WearDegree.UNBROKEN, 300, 100, 100);


    @BeforeClass
    public static void setCollectionData() {
        collection.add(baseEquip);
        collection.add(armorEquip100);
        collection.add(weaponEquip);
        collection.add(armorEquip200);
        collection.add(torsoEquip200);
        collection.add(cuttingWeaponEquip);
        collection.add(torsoEquip300);
    }

    @BeforeClass
    public static void setSearchByTypeResultData() {
        searchByTypeResult[0] = armorEquip100;
        searchByTypeResult[1] = armorEquip200;
        searchByTypeResult[2] = torsoEquip200;
        searchByTypeResult[3] = torsoEquip300;
    }

    @BeforeClass
    public static void setSearchByArmorResultData() {
        searchByArmorResult[0] = armorEquip200;
        searchByArmorResult[1] = torsoEquip200;
        searchByArmorResult[2] = torsoEquip300;

    }


    @Test
    public void searchByTypeTest() {
        assertArrayEquals(searchByTypeResult,searcher.equipmentTypeSearch(collection,ArmorEquipment.class));
    }


    @Test
    public void searchByArmorValueTest() throws IllegalRangeException {
        assertArrayEquals(searchByArmorResult,searcher.parameterSearch(behavior,collection,200,300));
    }
}