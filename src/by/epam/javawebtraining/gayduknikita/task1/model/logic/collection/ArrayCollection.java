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

    private int ptr;


    BaseEquipment[] equipArray;

    {
        ptr = 0;
    }


    public ArrayCollection() {
        equipArray = new BaseEquipment[DEFAULT_SIZE];
    }

    public ArrayCollection(int size) {
        if (size < 0) {
            size = DEFAULT_SIZE;
        }
        equipArray = new BaseEquipment[size];
    }


    int getPtr() {
        return ptr;
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
        return equipArray.length;
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
        for (int ptr = 0; ptr < equipArray.length; ptr++) {
            result.append(equipArray[ptr].toString() + "\n");
        }
        return result.toString();
    }
}
