/*creator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The creator interface is a template
 * for all creator classes.
 *
 */

public interface Creator {

    BaseEquipment factoryMethod();

    BaseEquipment factoryMethodRandomFill();

}
