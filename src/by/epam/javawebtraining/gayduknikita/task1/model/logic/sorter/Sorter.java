package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator.ParameterComparator;

public interface Sorter {
    void sortByType(BaseBag container, Class<? extends BaseEquipment> type);

    void sortByParameter(BaseBag container, ParameterComparator comparator);
}
