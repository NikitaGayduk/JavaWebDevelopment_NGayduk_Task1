/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.ArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;
import java.util.ArrayDeque;

public class EquipmentSorter implements Sorter{

    @Override
    public void sortByType(Container container, Class<? extends BaseEquipment> ... typeOrderArray) {


        //Makes typeOrderArray contain only unique values.
        ArrayDeque<Class> typeDeque = new ArrayDeque<>();

        for(Class type : typeOrderArray ){
            if(type == null){
                continue;
            }
            if(!typeDeque.contains(type)){
                typeDeque.add(type);
            }
        }

        //Sort array by the types deque
        int sortEnd = 0;

        for(Class type : typeDeque){

            for(int firstPtr = sortEnd; firstPtr < container.getSize() - 1; firstPtr++){

                if(container.get(firstPtr) == null || container.get(firstPtr).getClass() != type){

                    for(int secondPtr = firstPtr + 1; secondPtr < container.getSize(); secondPtr++){

                        if(container.get(secondPtr) == null){
                            continue;
                        }
                        if(container.get(secondPtr).getClass() == type){
                            BaseEquipment tmp = container.get(secondPtr);
                            container.addOn(secondPtr,container.get(firstPtr));
                            container.addOn(firstPtr,tmp);
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
}
