package by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Comparator;

public interface BaseParameterComparator<T extends BaseEquipment> extends Comparator <T> {
    Class<T> returnComparedClasses();

    @Override
    int compare(T o1, T o2);
}
