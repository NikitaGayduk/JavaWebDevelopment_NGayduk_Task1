/*TorsoArmorCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.EquipParamRandomizer.*;

/**
 * The TorsoArmorCreator class is a equipmentcreator
 * class for TorsoArmor. Implements equipmentcreator
 * interface
 */

public class TorsoArmorCreator implements EquipmentCreator {
    private static final int PRICE = 1000;
    private static final int ARMOR = 500;
    private static final int WAIST_GIRTH = 80;
    private static final int CHEST_GIRTH = 110;

    @Override
    public BaseEquipment factoryMethod() {
        return new TorsoArmor();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new TorsoArmor(getRandInt(PRICE), getRandWearDegree(),getRandInt(ARMOR), getRandDouble(WAIST_GIRTH),getRandDouble(CHEST_GIRTH));
    }

}
