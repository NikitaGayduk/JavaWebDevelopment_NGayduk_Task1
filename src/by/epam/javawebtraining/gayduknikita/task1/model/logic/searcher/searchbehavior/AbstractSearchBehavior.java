package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public abstract class AbstractSearchBehavior {

    public BaseEquipment[] searchByType(BaseBag container, Class<? extends BaseEquipment> classType) {

        ArrayList<BaseEquipment> result = new ArrayList<>(container.getSize());

        for (int ptr = 0; ptr < container.getSize(); ptr++) {
            if (container.get(ptr) != null && classType.isAssignableFrom(container.get(ptr).getClass())) {
                result.add(container.get(ptr));
            }
        }

        return result.toArray(new BaseEquipment[0]);
    }

    public abstract BaseEquipment[] searchByParameterValue(BaseBag container, int min, int max) throws IllegalRangeException;

    void validateMinMax(int min,int max) throws IllegalRangeException{
        if (min < 0 || min > max) {
            throw new IllegalRangeException();
        }
    }
}
