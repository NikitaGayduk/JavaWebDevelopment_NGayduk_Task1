/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.sortbehavior.AbstractSortBehavior;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.sortbehavior.PriceSortBehavior;

public class EquipmentSorter implements Sorter {

    private AbstractSortBehavior behavior;

    public EquipmentSorter() {
        this.behavior = new PriceSortBehavior();
    }

    public EquipmentSorter(AbstractSortBehavior behavior) {
        this.behavior = behavior;
    }

    public void sortByType(BaseBag container, Class<? extends BaseEquipment> type) {
        behavior.sortByType(container,type);
    }

    public void sortByParameter(BaseBag container) {
        behavior.sortByParameter(container);
    }

    public void setBehavior(AbstractSortBehavior behavior) {
        this.behavior = behavior;
    }
}
