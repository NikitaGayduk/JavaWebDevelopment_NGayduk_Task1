package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;


import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalRangeException;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.AbstractSearchBehavior;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.searchbehavior.PriceSearchBehavior;


public class EquipmentSearcher {
    private static AbstractSearchBehavior behavior;


    public EquipmentSearcher() {
        this.behavior = new PriceSearchBehavior();
    }

    public EquipmentSearcher(AbstractSearchBehavior behavior) {
        this.behavior = behavior;
    }

    public static void setBehavior(AbstractSearchBehavior behav){
        behavior = behav;
    }


    public static BaseEquipment[] equipmentTypeSearch(Collection collection, Class type) {
        return behavior.searchByType(collection, type);
    }

    public static BaseEquipment[] parameterSearch(AbstractSearchBehavior behavior, Collection collection
            , int min, int max) throws IllegalRangeException {
        setBehavior(behavior);
        return behavior.searchByParameterValue(collection,min,max);
    }


}

