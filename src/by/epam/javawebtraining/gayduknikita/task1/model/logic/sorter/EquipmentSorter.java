/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator.ParameterComparator;

public class EquipmentSorter implements Sorter {

    public void sortByType(BaseBag container, Class<? extends BaseEquipment> type) {
        if (container.getSize() < 2) {
            return;
        }

        for (int firstPtr = 0,uncheckedPtr = 1; firstPtr < container.getSize() - 1 && uncheckedPtr < container.getSize(); firstPtr++) {

            if (container.get(firstPtr) == null || container.get(firstPtr).getClass() != type) {

                while (uncheckedPtr < container.getSize()) {
                    if (container.get(uncheckedPtr) != null
                            && type.isAssignableFrom(container.get(uncheckedPtr).getClass())) {

                        BaseEquipment tmp = container.get(uncheckedPtr);
                        container.addOn(uncheckedPtr, container.get(firstPtr));
                        container.addOn(firstPtr, tmp);
                        uncheckedPtr++;
                        break;
                    }
                    uncheckedPtr++;
                }
            }
        }
    }

    public void sortByParameter(BaseBag container, ParameterComparator comparator) {
        sortByType(container, comparator.returnComparedClasses());
        for (int firstPtr = 0; firstPtr < container.getSize()
                && comparator.returnComparedClasses().isAssignableFrom(container.get(firstPtr).getClass())
                ; firstPtr++) {

            for (int secondPtr = firstPtr + 1; secondPtr < container.getSize()
                    && comparator.returnComparedClasses().isAssignableFrom(container.get(secondPtr).getClass())
                    ; secondPtr++) {

                if (comparator.compare(container.get(firstPtr), container.get(secondPtr)) < 0) {
                    BaseEquipment tmp = container.get(secondPtr);
                    container.addOn(secondPtr, container.get(firstPtr));
                    container.addOn(firstPtr, tmp);
                }

            }

        }

    }
}
