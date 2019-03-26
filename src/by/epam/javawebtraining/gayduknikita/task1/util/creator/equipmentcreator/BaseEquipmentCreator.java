/*BaseEquipmentCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.EquipParamRandomizer.*;


/**
 * The BaseEquipmentCreator class is a equipmentcreator
 * class for BaseEquipment. Implements equipmentcreator
 * interface
 */

public class BaseEquipmentCreator implements EquipmentCreator {
    private static final int PRICE = 1000;

    @Override
    public BaseEquipment factoryMethod(){
        return new BaseEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {

        return new BaseEquipment(getRandInt(PRICE), getRandWearDegree());
    }
}
