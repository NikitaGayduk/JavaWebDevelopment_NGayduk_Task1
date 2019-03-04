package by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Comparator;

public abstract class BaseParameterComparator<T extends BaseEquipment> implements Comparator <T> {
    public abstract Class<T> returnComparedClasses();

    @Override
    public abstract int compare(T o1, T o2);
}
