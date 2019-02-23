/*CuttingWeaponCreator
 * 1.0
 * 19/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.equipcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.CuttingWeapon;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.equipcreator.EquipParamRandomizer.*;

/**
 * The TorsoArmorCreator class is a equipcreator
 * class for TorsoArmor. Implements equipcreator
 * interface
 */

public class CuttingWeaponCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod() {
        return new CuttingWeapon();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new CuttingWeapon(getRandInt(600), getRandWearDegree(),getRandInt(300),getRandInt(200));
    }

}
