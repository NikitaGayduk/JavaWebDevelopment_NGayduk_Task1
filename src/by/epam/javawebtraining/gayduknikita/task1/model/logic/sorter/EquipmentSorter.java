/*SortOrder
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;

public class EquipmentSorter implements Sorter{

    @Override
    public void sortByType(Container container, Class<? extends BaseEquipment>... equipClassArray) {

        /*
         * Makes equipClassArray contain only unique values.
         */
        for(int ptr = 0; ptr < equipClassArray.length; ptr++){
            if(equipClassArray[ptr] == null){
                continue;
            }

            for(int localPtr = ptr + 1; localPtr < equipClassArray.length; localPtr++){
                if(equipClassArray[ptr] == equipClassArray[localPtr]){
                    equipClassArray[localPtr] = null;
                }
            }
        }

        for(int classArrayPtr = 0; classArrayPtr < equipClassArray.length; classArrayPtr++) {
            for (int ptr = 0; ptr < container.getSize(); ptr++){

            }
        }

    }
}
