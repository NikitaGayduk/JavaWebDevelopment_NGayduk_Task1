/*Container
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.container;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The Container class is a basic
 * interface for all container classes
 */

public interface Container {

    boolean add(BaseEquipment equip);

    boolean addOn(int index, BaseEquipment equip);

    BaseEquipment get(int index);

    BaseEquipment[] getAll();

    int getSize();

    boolean remove(int index);

    void clearAll();

}
