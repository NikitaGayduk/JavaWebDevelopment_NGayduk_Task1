/*equipcreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.equipcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The equipcreator interface is a template
 * for all equipcreator classes.
 *
 */

public interface Creator {

    BaseEquipment factoryMethod();

    BaseEquipment factoryMethodRandomFill();

}
