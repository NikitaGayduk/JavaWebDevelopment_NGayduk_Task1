/*Sorter
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;

public interface Sorter {

    public void sortByType(Container container, Class<? extends BaseEquipment>... equipClassArray);
    //public void sort(Container container, SortOrder order, //Поле);

}
