/*equipmentcreator
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The equipmentcreator interface is a template
 * for all equipmentcreator classes.
 *
 */

public interface EquipmentCreator {

    BaseEquipment factoryMethod();

    BaseEquipment factoryMethodRandomFill();

}
