/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator.BaseParameterComparator;

public class BaseEquipmentSorter {

    public static void sortByType(Collection collection, Class<? extends BaseEquipment> type) {
        if (collection.getSize() < 2) {
            return;
        }

        int uncheckedPtr = 1;
        for (int firstPtr = 0; firstPtr < collection.getSize() - 1 && uncheckedPtr < collection.getSize(); firstPtr++) {

            if (collection.get(firstPtr) == null || collection.get(firstPtr).getClass() != type) {

                while (uncheckedPtr < collection.getSize()) {
                    if (collection.get(uncheckedPtr) != null
                            && type.isAssignableFrom(collection.get(uncheckedPtr).getClass())) {

                        BaseEquipment tmp = collection.get(uncheckedPtr);
                        collection.addOn(uncheckedPtr, collection.get(firstPtr));
                        collection.addOn(firstPtr, tmp);
                        uncheckedPtr++;
                        break;
                    }
                    uncheckedPtr++;
                }
            }
        }
    }

    public static void sortByParameter(Collection collection, BaseParameterComparator comparator) {
        sortByType(collection, comparator.returnComparedClasses());
        for (int firstPtr = 0; firstPtr < collection.getSize()
                && comparator.returnComparedClasses().isAssignableFrom(collection.get(firstPtr).getClass())
                ; firstPtr++) {

            for (int secondPtr = firstPtr + 1; secondPtr < collection.getSize()
                    && comparator.returnComparedClasses().isAssignableFrom(collection.get(secondPtr).getClass())
                    ; secondPtr++) {

                if (comparator.compare(collection.get(firstPtr), collection.get(secondPtr)) < 0) {
                    BaseEquipment tmp = collection.get(secondPtr);
                    collection.addOn(secondPtr, collection.get(firstPtr));
                    collection.addOn(firstPtr, tmp);
                }

            }

        }

    }
}
