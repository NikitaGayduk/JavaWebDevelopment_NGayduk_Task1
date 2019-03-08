package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public class WearDegreeSearchBehavior extends AbstractSearchBehavior {

    @Override
    void validateMinMax(int min, int max) throws IllegalRangeException {
        if (min < 0 || min > max || max < 0 || max - 1 > BaseEquipment.WearDegree.values().length) {
            throw new IllegalRangeException();
        }
    }

    @Override
    public BaseEquipment[] searchByParameterValue(Collection collection, int min, int max) throws IllegalRangeException {
        validateMinMax(min,max);
        ArrayList<BaseEquipment> result = new ArrayList<>(collection.getSize());

        for (int ptr = 0; ptr < collection.getSize(); ptr++) {
            if (collection.get(ptr).getEquipmentState().ordinal() >= min
                    && collection.get(ptr).getEquipmentState().ordinal() <= max) {
                result.add(collection.get(ptr));
            }
        }

        return result.toArray(new BaseEquipment[result.size()]);

    }
}
