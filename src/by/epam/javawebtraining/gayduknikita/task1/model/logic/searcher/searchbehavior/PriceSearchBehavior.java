package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public class PriceSearchBehavior extends AbstractSearchBehavior {

    @Override
    public BaseEquipment[] searchByParameterValue(BaseBag container, int min, int max) throws IllegalRangeException {
        validateMinMax(min,max);

        ArrayList<BaseEquipment> result = new ArrayList<>(container.getSize());

        for (int ptr = 0; ptr < container.getSize(); ptr++) {
            if (container.get(ptr).getPrice() >= min
                    && container.get(ptr).getPrice() <= max) {
                result.add(container.get(ptr));
            }
        }

        return result.toArray(new BaseEquipment[result.size()]);
    }
}
