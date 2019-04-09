package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;

public class BaseBag {

    private Collection collection;

    public BaseBag() {
        this.collection = new ArrayCollection();
    }

    public BaseBag(Collection collection) {
        this.collection = collection;
    }

    public BaseBag(BaseBag bag) {
        this.collection = new ArrayCollection(bag.collection.getSize());
        for (int ptr = 0; ptr < collection.getSize(); ptr++) {
            this.collection.add(bag.collection.get(0).getCopy());
        }
    }

    public boolean add(BaseEquipment equip) {
        return collection.add(equip);
    }

    public boolean addOn(int index, BaseEquipment equip) {
        return collection.addOn(index, equip);
    }

    public BaseEquipment get(int index) {
        return collection.get(index);
    }

    public BaseEquipment[] getAll() {
        return collection.getAll();
    }

    public int getSize() {
        return collection.getSize();
    }

    public boolean remove(int index) {
        return collection.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseBag that = (BaseBag) o;
        return collection.equals(that.collection);
    }

    @Override
    public int hashCode() {
        return collection.hashCode();
    }

    @Override
    public String toString() {
        return collection.toString();
    }
}
