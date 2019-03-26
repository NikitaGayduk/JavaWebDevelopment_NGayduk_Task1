package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;

import java.util.ArrayList;

public class ArmorSearchBehavior extends AbstractSearchBehavior {

    @Override
    public BaseEquipment[] searchByParameterValue(BaseBag container, int min, int max) throws IllegalRangeException {
        validateMinMax(min,max);

        BaseEquipment[] array = searchByType(container, ArmorEquipment.class);

        ArrayList<BaseEquipment> result = new ArrayList<>(array.length);

        for (int ptr = 0; ptr < array.length; ptr++) {
            if (((ArmorEquipment) array[ptr]).getArmorValue() >= min
                    && ((ArmorEquipment) array[ptr]).getArmorValue() <= max) {
                result.add(array[ptr]);
            }
        }

        return result.toArray(new BaseEquipment[0]);
    }
}
