package by.epam.javawebtraining.gayduknikita.task1.Controller;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.DynamicArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.EquipmentSorter;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.Sorter;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.BaseEquipmentCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.Creator;


public class Knight {

    public static void main(String[] args) {
        Creator baseEquipmentCreator = new BaseEquipmentCreator();
        Container container = new DynamicArrayContainer();
        Sorter sorte = new EquipmentSorter();
        BaseEquipment base = baseEquipmentCreator.factoryMethodRandomFill();
    }
}