package by.epam.javawebtraining.gayduknikita.task1.util.equipcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.WeaponEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.equipcreator.EquipParamRandomizer.*;

public class WeaponCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod() {
        return new WeaponEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new WeaponEquipment(getRandInt(1000), getRandWearDegree(), getRandInt(300));
    }
}
