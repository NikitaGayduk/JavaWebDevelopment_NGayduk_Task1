/*BreastplateCreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.Breastplate;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The BreastplateCreator class is a creator
 * class for Breastplate. Implements Creator
 * interface
 */

public class BreastplateCreator implements Creator {

    @Override
    public BaseEquipment factoryMethod() {
        return new Breastplate();
    }

}
