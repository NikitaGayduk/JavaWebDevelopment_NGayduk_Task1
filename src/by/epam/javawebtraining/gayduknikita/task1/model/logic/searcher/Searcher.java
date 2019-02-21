package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;

public interface Searcher {

    BaseEquipment[] searchByType(Collection collection, Class<? extends BaseEquipment>... typeOrderArray);


}
