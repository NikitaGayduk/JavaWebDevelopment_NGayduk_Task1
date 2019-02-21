package by.epam.javawebtraining.gayduknikita.task1.Controller;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.Calculator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.EquipmentSorter;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.Sorter;

public class BaseBag {
    private Collection collection;
    private Sorter sorter = new EquipmentSorter();



    public BaseBag() {
        collection = new ArrayCollection();
    }

    public BaseBag(int bagSize) {
        collection = new ArrayCollection(bagSize);
    }



    public boolean add(BaseEquipment equip) {
        return collection.add(equip);
    }

    public boolean addAt(int place, BaseEquipment equip) {
        return collection.addOn(place, equip);
    }

    public BaseEquipment get(int place) {
        return collection.get(place);
    }

    public BaseEquipment[] getAll() {
        return collection.getAll();
    }

    public void sort() {
        sorter.sortByWearDegree(collection);
    }

    public BaseEquipment[] search() {
        return null;
    }

    public int calculateCost() {
        return Calculator.calculateCost(collection);
    }


}
