package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.sortbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * @author NikitaGayduk
 * @date 26.03.2019
 */
public class PriceSortBehavior extends AbstractSortBehavior {

    @Override
    public void sortByParameter(BaseBag container) {
        for (int firstPtr = 0; firstPtr < container.getSize(); firstPtr++) {

            for (int secondPtr = firstPtr + 1; secondPtr < container.getSize(); secondPtr++) {

                if (container.get(firstPtr).compareTo(container.get(secondPtr)) < 0) {
                    BaseEquipment tmp = container.get(secondPtr);
                    container.addOn(secondPtr, container.get(firstPtr));
                    container.addOn(firstPtr, tmp);
                }
            }
        }
    }
}
