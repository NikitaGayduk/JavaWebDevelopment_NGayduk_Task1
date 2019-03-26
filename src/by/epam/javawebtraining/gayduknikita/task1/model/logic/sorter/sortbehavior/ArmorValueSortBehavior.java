package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.sortbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator.ArmorValueComparator;

import java.util.Comparator;

/**
 * @author NikitaGayduk
 * @date 26.03.2019
 */
public class ArmorValueSortBehavior extends AbstractSortBehavior {

    @Override
    public void sortByParameter(BaseBag container) {
        Comparator<ArmorEquipment> comparator = new ArmorValueComparator();

        sortByType(container, ArmorEquipment.class);

        for (int firstPtr = 0; firstPtr < container.getSize()
                && ArmorEquipment.class.isAssignableFrom(container.get(firstPtr).getClass())
                ; firstPtr++) {

            for (int secondPtr = firstPtr + 1; secondPtr < container.getSize()
                    && ArmorEquipment.class.isAssignableFrom(container.get(secondPtr).getClass())
                    ; secondPtr++) {

                if (comparator.compare((ArmorEquipment) container.get(firstPtr)
                        , (ArmorEquipment) container.get(secondPtr)) < 0) {
                    BaseEquipment tmp = container.get(secondPtr);
                    container.addOn(secondPtr, container.get(firstPtr));
                    container.addOn(firstPtr, tmp);
                }
            }
        }
    }
}
