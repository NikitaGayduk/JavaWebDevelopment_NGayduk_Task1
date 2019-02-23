package by.epam.javawebtraining.gayduknikita.task1.controller;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.WeaponEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.Calculator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.comporator.WearDegreeComporator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher.BaseEquipmentSearcher;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.BaseEquipmentSorter;

public class BaseBag {
    private Collection collection;


    public BaseBag() {
        collection = new ArrayCollection();
    }

    public BaseBag(int bagSize) {
        collection = new ArrayCollection(bagSize);
    }

    public BaseBag(Collection collection) {
        this.collection = collection;
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

    public void sortByArmorEquipment() {
        BaseEquipmentSorter.sortByType(collection, ArmorEquipment.class);
    }

/*    public void sortByWearDegree() {
        BaseEquipmentSorter.sortByWearDegree(collection, new WearDegreeComporator());
    }*/

    public BaseEquipment[] searchByWeaponType() {
        return BaseEquipmentSearcher.searchByType(collection, WeaponEquipment.class);
    }

    public BaseEquipment[] searchByArmorType() {
        return BaseEquipmentSearcher.searchByType(collection, ArmorEquipment.class);
    }

    public BaseEquipment[] searchByArmorValue(int min, int max) {
        return BaseEquipmentSearcher.searchByArmorValue(collection, min, max);
    }

    public int calculateCost() {
        return Calculator.calculateCost(collection.getAll());
    }


}
