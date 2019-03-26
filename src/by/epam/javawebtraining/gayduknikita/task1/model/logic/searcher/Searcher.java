package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.AbstractSearchBehavior;

public interface Searcher {

    void setBehavior(AbstractSearchBehavior behavior);

    BaseEquipment[] equipmentTypeSearch(BaseBag container, Class<? extends BaseEquipment> type);

    BaseEquipment[] parameterSearch(BaseBag container
            , int min, int max) throws IllegalRangeException;
}
