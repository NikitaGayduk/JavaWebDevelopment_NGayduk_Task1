/*ArmorCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import static by.epam.javawebtraining.gayduknikita.task1.util.Creator.EquipParamRandomize.*;

/**
 * The ArmorCreator class is a creator
 * class for ArmorEquipment. Implements Creator
 * interface
 */

public class ArmorCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod() {
        return new ArmorEquipment();
    }

    @Override
    public BaseEquipment factoryMethodRandomFill() {
        return new ArmorEquipment(getRandInt(1000),getRandWearDegree(),getRandInt(300));
    }

}
