/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comporator.WearDegreeComporator;

import java.util.ArrayDeque;
import java.util.Comparator;

public class BaseEquipmentSorter {

    public static void sortByType(Collection collection, Class<? extends BaseEquipment>... typeOrderArray) {
        //Makes typeOrderArray contain only unique values.
        ArrayDeque<Class> typeDeque = new ArrayDeque<>();

        for (Class type : typeOrderArray) {
            if (type == null) {
                continue;
            }
            if (!typeDeque.contains(type)) {
                typeDeque.add(type);
            }
        }

        /*This code sort array by the types deque.
         * Sort from begin by first type, than
         * remember where it stop and begin sort
         * by the second type from the stop point
         */
        int sortEnd = 0;

        for (Class type : typeDeque) {

            for (int firstPtr = sortEnd; firstPtr < collection.getSize() - 1; firstPtr++) {

                if (collection.get(firstPtr) == null || collection.get(firstPtr).getClass() != type) {

                    for (int secondPtr = firstPtr + 1; secondPtr < collection.getSize(); secondPtr++) {

                        if (collection.get(secondPtr) == null) {
                            continue;
                        }
                        if (collection.get(secondPtr).getClass() == type) {
                            BaseEquipment tmp = collection.get(secondPtr);
                            collection.addOn(secondPtr, collection.get(firstPtr));
                            collection.addOn(firstPtr, tmp);
                            sortEnd++;
                            break;
                        }
                    }
                } else {
                    sortEnd++;
                }
            }
            sortEnd++;
        }
    }

    public static void sortByParameter(Collection collection, String parameter){
        switch (parameter){
            case "WearDegree" :

        }
    }
/*
    public static void sortByWearDegree(Collection collection, Comparator<? extends BaseEquipment> comparator ) {
        WearDegreeComporator comporator = new WearDegreeComporator();
        sortByType(collection, BaseEquipment.class);
        for (int ptr = 0; ptr < collection.getSize() - 1; ptr++) {
            int result = comparator.compare(collection.get(ptr),collection.get(ptr+1));
            if(result < 0){

            }
        }
    }
*/

}
