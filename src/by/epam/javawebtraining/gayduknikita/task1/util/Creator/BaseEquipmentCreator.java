/*BaseEquipmentCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The BaseEquipmentCreator class is a creator
 * class for BaseEquipment. Implements Creator
 * interface
 */

public class BaseEquipmentCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod(){
        return new BaseEquipment();
    }

}
