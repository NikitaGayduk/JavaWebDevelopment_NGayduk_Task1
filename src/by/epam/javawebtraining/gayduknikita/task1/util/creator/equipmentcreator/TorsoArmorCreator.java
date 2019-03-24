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

    @Override
    public BaseEquipment factoryMethod() {
        return new TorsoArmor();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new TorsoArmor(getRandInt(600), getRandWearDegree(),getRandInt(300), getRandDouble(100),getRandDouble(90));
    }

}
