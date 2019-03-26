/*CuttingWeaponCreator
 * 1.0
 * 19/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.CuttingWeapon;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.EquipParamRandomizer.*;

/**
 * The TorsoArmorCreator class is a equipmentcreator
 * class for TorsoArmor. Implements equipmentcreator
 * interface
 */

public class CuttingWeaponCreator implements EquipmentCreator {
    private static final int PRICE = 1000;
    private static final int DAMAGE = 300;
    private static final int CUTTING_DAMAGE = 300;

    @Override
    public BaseEquipment factoryMethod() {
        return new CuttingWeapon();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new CuttingWeapon(getRandInt(PRICE), getRandWearDegree(),getRandInt(DAMAGE),getRandInt(CUTTING_DAMAGE));
    }

}
