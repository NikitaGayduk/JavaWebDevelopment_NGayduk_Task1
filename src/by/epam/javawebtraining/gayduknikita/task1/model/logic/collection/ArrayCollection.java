/*ArrayCollection
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Arrays;

/**
 * The ArrayCollection class is a bicycle
 * class that shows my knowledge about static arrays.
 * Implements Collection
 */

public class ArrayCollection implements Collection {

    private int ptr;

    //can I make it package-private? or it's must be private?
    BaseEquipment[] equipArray;

    {
        ptr = 0;
    }


    public ArrayCollection() {
        equipArray = new BaseEquipment[10];
    }

    public ArrayCollection(int size) {
        equipArray = new BaseEquipment[size];
    }


    int getPtr() {
        return ptr;
    }

    void setPtr(int ptr) {
        this.ptr = ptr;
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
    // TODO: 18.02.2019 Can return null, in IDEA I can mark it like @Nullable and @NotNull, can I?
    public BaseEquipment get(int index) {
        if (equipArray[index] == null) {
            return null;
        }
        return equipArray[index];
    }

    @Override
    public BaseEquipment[] getAll() {
        BaseEquipment[] tmp = new BaseEquipment[getSize()];
        for (int localPtr = 0; localPtr < tmp.length; localPtr++) {
            tmp[localPtr] = this.get(localPtr);
        }
        return tmp;
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
}
