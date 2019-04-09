package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;

/**
 * @author NikitaGayduk
 * @date 09.04.2019
 */
public class DataSetter {
    private static final BaseBag result = new BaseBag();

    static {
        result.add(new BaseEquipment(300, BaseEquipment.WearDegree.UNBROKEN));
        result.get(0).setId(1);
        result.add(new ArmorEquipment(400, BaseEquipment.WearDegree.THREADBARE,100));
        result.get(1).setId(2);
        result.add(new TorsoArmor(700, BaseEquipment.WearDegree.SLIGHTLY_WORN,300,83.5,110.7));
        result.get(2).setId(3);
        result.add(new WeaponEquipment(400, BaseEquipment.WearDegree.BROKEN,300));
        result.get(3).setId(4);
        result.add(new CuttingWeapon(650, BaseEquipment.WearDegree.SLIGHTLY_WORN,250,200));
        result.get(4).setId(5);
    }

    public static BaseBag getTestData(){
        return result;
    }
}
