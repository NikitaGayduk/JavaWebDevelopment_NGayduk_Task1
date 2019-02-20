package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;

public interface Searcher {

    BaseEquipment[] searchByType(Container container, Class<? extends BaseEquipment>... typeOrderArray);


}
