/*Collection
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalCollectionIndexException;

/**
 * The Collection class is a basic
 * interface for all collection classes
 */

public interface Collection {

    boolean add(BaseEquipment equip);

    boolean addOn(int index, BaseEquipment equip);

    BaseEquipment get(int index);

    BaseEquipment[] getAll();

    int getSize();

    boolean remove(int index);

}
