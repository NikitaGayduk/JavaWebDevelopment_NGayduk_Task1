package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.WeaponEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.EquipParamRandomizer.*;

public class WeaponCreator implements EquipmentCreator {

    @Override
    public BaseEquipment factoryMethod() {
        return new WeaponEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new WeaponEquipment(getRandInt(1000), getRandWearDegree(), getRandInt(300));
    }
}
