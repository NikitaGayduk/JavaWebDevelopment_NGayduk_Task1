/*ArrayCollection
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalCollectionIndexException;

import java.util.Arrays;
import java.util.Objects;

/**
 * The ArrayCollection class is a bicycle
 * class that shows my knowledge about static arrays.
 * Implements Collection
 */

public class ArrayCollection implements Collection {

    private static int DEFAULT_SIZE = 10;

    private int ptr = 0;


    private BaseEquipment[] equipArray;

    public ArrayCollection() {
        equipArray = new BaseEquipment[DEFAULT_SIZE];
    }

    public ArrayCollection(int size) {
        if (size > 0) {
            equipArray = new BaseEquipment[size];
        } else {
            equipArray = new BaseEquipment[DEFAULT_SIZE];
        }
    }


    int getPtr() {
        return ptr;
    }

    boolean setEquipArray(BaseEquipment[] equipArray) {
        if (equipArray.length > this.equipArray.length) {
            this.equipArray = equipArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(BaseEquipment equip) {
        if (ptr >= equipArray.length) {
            return false;
        }
        equipArray[ptr] = equip;
        ptr++;
        return true;
    }

    @Override
    public boolean addOn(int index, BaseEquipment equip) {
        if (index < 0 || index >= equipArray.length) {
            return false;
        }
        equipArray[index] = equip;
        return true;
    }

    @Override
    public BaseEquipment get(int index) {
        return equipArray[index];
    }

    @Override
    public BaseEquipment[] getAll() {
        return equipArray;
    }

    @Override
    public int getSize() {
        return ptr;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= equipArray.length || equipArray[index] == null) {
            return false;
        }
        /*
         * Replace deleted value by last value
         */
        equipArray[index] = equipArray[ptr - 1];
        equipArray[ptr - 1] = null;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrayCollection that = (ArrayCollection) o;

        if (this.getSize() != that.getSize()) {
            return false;
        }

        for (int ptr = 0; ptr < equipArray.length; ptr++) {
            if (!this.get(ptr).equals(that.get(ptr))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(equipArray);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int ptr = 0; ptr < getSize(); ptr++) {
            if (equipArray[ptr] != null) {
                result.append(equipArray[ptr].toString() + "\n");
            } else {
                result.append("Empty element\n");
            }
        }
        return result.toString();
    }
}
