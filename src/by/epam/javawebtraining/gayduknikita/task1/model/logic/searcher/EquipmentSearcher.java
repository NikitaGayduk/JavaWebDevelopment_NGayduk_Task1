package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;


import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.AbstractSearchBehavior;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.PriceSearchBehavior;


public class EquipmentSearcher implements Searcher {
    private AbstractSearchBehavior behavior;


    public EquipmentSearcher() {
        behavior = new PriceSearchBehavior();
    }

    public EquipmentSearcher(AbstractSearchBehavior behavior) {
        this.behavior = behavior;
    }


    public BaseEquipment[] equipmentTypeSearch(BaseBag container, Class<? extends BaseEquipment> type) {
        return behavior.searchByType(container, type);
    }

    public BaseEquipment[] parameterSearch(BaseBag container
            , int min, int max) throws IllegalRangeException {
        return behavior.searchByParameterValue(container, min, max);
    }

    public void setBehavior(AbstractSearchBehavior behavior) {
        this.behavior = behavior;
    }
}

