/*ArrayEquipList
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalCollectionIndexException;

/**
 * The ArrayEquipList class is a bicycle
 * class that shows my knowledge about static arrays.
 * Implements EquipList
 */

public class ArrayEquipList implements EquipList {

    private static int DEFAULT_CAPACITY = 20;
    private static int DEFAULT_NEW_CAPACITY = 50;
    private static double DEFAULT_RESIZE_FACTOR = 1.3;

    private int capacity;
    private int size = 0;
    private int ptr = 0;

    private BaseEquipment[] equipArray;

    public ArrayEquipList() {
        equipArray = new BaseEquipment[DEFAULT_CAPACITY];
    }

    public ArrayEquipList(int capacity) {
        equipArray = new BaseEquipment[capacity];
    }

    public ArrayEquipList(EquipCollection list) {
        equipArray = new BaseEquipment[list.size()];
        equipArray = list.toArray();
    }


    public boolean add(BaseEquipment equip) {
        if (ptr >= equipArray.length) {
            resize();
        }
        equipArray[ptr] = equip;
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int iterator = 0; iterator <= size; iterator++) {
            if (equipArray[iterator] == null) {
                stringBuffer.append("Empty");
            } else {
                stringBuffer.append(equipArray[iterator].toString());
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    @Override
    public boolean replace(int index, BaseEquipment equip) {
        if (index < 0 || index > size) {
            return false;
        }
        equipArray[index] = equip;
        return true;
    }

    @Override
    public BaseEquipment get(int index) throws IllegalCollectionIndexException {
        if (index < 0 || index > size) {
            throw new IllegalCollectionIndexException();
        }

        return equipArray[index];

    }

    @Override
    public BaseEquipment[] toArray() {
        BaseEquipment[] tmpArray = new BaseEquipment[size + 1];
        System.arraycopy(equipArray,0,tmpArray,0,size + 1);
        return new BaseEquipment[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > ptr + 1) {
            return false;
        } else if (ptr == 0) {

        }
        {
            equipArray[index - 1] = equipArray[ptr - 1];
            equipArray[ptr] = null;
            return true;
        }
    }

    private void resize() {
        BaseEquipment[] equipArrayTmp = new BaseEquipment[generateNewSize()];

        for (int ptr = 0; ptr < this.equipArray.length; ptr++) {
            equipArrayTmp[ptr] = this.get(ptr);
        }

        this.equipArray = equipArrayTmp;
    }

    private int generateNewSize() {
        int newSize;

        if (this.equipArray.length < DEFAULT_NEW_CAPACITY) {
            newSize = DEFAULT_NEW_CAPACITY;
        } else {
            newSize = (int) (this.equipArray.length * DEFAULT_RESIZE_FACTOR);
        }
        return newSize;
    }


}
