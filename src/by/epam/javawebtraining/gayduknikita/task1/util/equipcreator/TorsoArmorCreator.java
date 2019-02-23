/*TorsoArmorCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.equipcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.equipcreator.EquipParamRandomizer.*;

/**
 * The TorsoArmorCreator class is a equipcreator
 * class for TorsoArmor. Implements equipcreator
 * interface
 */

public class TorsoArmorCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod() {
        return new TorsoArmor();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new TorsoArmor(getRandInt(600), getRandWearDegree(),getRandInt(300), getRandDouble(100),getRandDouble(90));
    }

}
