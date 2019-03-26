/*ArmorCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import static by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.EquipParamRandomizer.*;

/**
 * The ArmorCreator class is a creator
 * class for ArmorEquipment. Implements EquipmentCreator
 * interface
 */

public class ArmorCreator implements EquipmentCreator {
    private static final int PRICE = 1000;
    private static final int ARMOR = 500;

    @Override
    public BaseEquipment factoryMethod() {
        return new ArmorEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new ArmorEquipment(getRandInt(PRICE),getRandWearDegree(),getRandInt(ARMOR));
    }

}
