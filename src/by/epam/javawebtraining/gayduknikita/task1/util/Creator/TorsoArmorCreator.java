/*TorsoArmorCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.Creator.EquipParamRandomize.*;

/**
 * The TorsoArmorCreator class is a creator
 * class for TorsoArmor. Implements Creator
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
