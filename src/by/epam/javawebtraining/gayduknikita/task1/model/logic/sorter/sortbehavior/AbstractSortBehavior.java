package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.sortbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * @author NikitaGayduk
 * @date 26.03.2019
 */
public abstract class AbstractSortBehavior {


    public void sortByType(BaseBag container, Class<? extends BaseEquipment> type) {
        if (container.getSize() < 2) {
            return;
        }

        for (int firstPtr = 0,uncheckedPtr = 1; firstPtr < container.getSize() - 1 && uncheckedPtr < container.getSize()
                ; firstPtr++) {

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

    public abstract void sortByParameter(BaseBag container);

}
