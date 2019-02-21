/*BaseEquipmentCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import static by.epam.javawebtraining.gayduknikita.task1.util.creator.EquipParamRandomize.*;


/**
 * The BaseEquipmentCreator class is a creator
 * class for BaseEquipment. Implements creator
 * interface
 */

public class BaseEquipmentCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod(){
        return new BaseEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {

        return new BaseEquipment(getRandInt(1000), getRandWearDegree());
    }
}
