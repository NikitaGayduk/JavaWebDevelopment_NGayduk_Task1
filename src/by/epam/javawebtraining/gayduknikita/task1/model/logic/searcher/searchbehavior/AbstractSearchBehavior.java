package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public abstract class AbstractSearchBehavior {

    public BaseEquipment[] searchByType(Collection collection, Class<? extends BaseEquipment> classType) {

        ArrayList<BaseEquipment> result = new ArrayList<>(collection.getSize());

        for (int ptr = 0; ptr < collection.getSize(); ptr++) {
            if (collection.get(ptr) != null && classType.isAssignableFrom(collection.get(ptr).getClass())) {
                result.add(collection.get(ptr));
            }
        }

        return result.toArray(new BaseEquipment[result.size()]);
    }

    void validateMinMax(int min,int max) throws IllegalRangeException{
        if (min < 0 || min > max || max < 0) {
            throw new IllegalRangeException();
        }
    }

    abstract public BaseEquipment[] searchByParameterValue(Collection collection, int min, int max) throws IllegalRangeException;
}
