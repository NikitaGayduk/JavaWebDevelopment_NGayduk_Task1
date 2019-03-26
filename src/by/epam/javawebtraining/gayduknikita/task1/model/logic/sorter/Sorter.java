package by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

public interface Sorter {
    void sortByType(BaseBag container, Class<? extends BaseEquipment> type);

    void sortByParameter(BaseBag container);
}
