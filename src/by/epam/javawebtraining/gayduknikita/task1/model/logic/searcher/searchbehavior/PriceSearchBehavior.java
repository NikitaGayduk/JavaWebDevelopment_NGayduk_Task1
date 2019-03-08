package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public class PriceSearchBehavior extends AbstractSearchBehavior {

    @Override
    public BaseEquipment[] searchByParameterValue(Collection collection, int min, int max) throws IllegalRangeException {
        validateMinMax(min,max);

        ArrayList<BaseEquipment> result = new ArrayList<>(collection.getSize());

        for (int ptr = 0; ptr < collection.getSize(); ptr++) {
            if (collection.get(ptr).getPrice() >= min
                    && collection.get(ptr).getPrice() <= max) {
                result.add(collection.get(ptr));
            }
        }

        return result.toArray(new BaseEquipment[result.size()]);
    }
}
