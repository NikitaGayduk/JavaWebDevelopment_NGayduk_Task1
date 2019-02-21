/*Sorter
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;

public interface Sorter {

    void sortByType(Collection collection, Class<? extends BaseEquipment>... equipClassArray);

    void sortByWearDegree(Collection collection);
}
