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

    public boolean add(BaseEquipment equip);

    public BaseEquipment get(int index);

    public boolean remove(int index);

    public void clearAll();

}
