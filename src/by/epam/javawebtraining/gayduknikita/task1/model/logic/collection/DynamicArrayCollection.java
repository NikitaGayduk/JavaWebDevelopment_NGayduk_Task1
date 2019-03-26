/*DynamicArrayCollection
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.collection;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The DynamicArrayCollection class is a bicycle
 * class that shows my knowledge about dynamic arrays.
 * Extends ArrayCollection
 */

public class DynamicArrayCollection extends ArrayCollection {

    private static int DEFAULT_SIZE = 40;
    private static int DEFAULT_NEW_SIZE = 50;
    private static double DEFAULT_RESIZE_FACTOR = 1.3;

    public DynamicArrayCollection() {
        super();
    }

    public DynamicArrayCollection(int size) {
        super(size);
    }

    @Override
    public boolean add(BaseEquipment equip) {
        if (this.getPtr() >= getSize()) {
            resize();
        }
        return super.add(equip);
    }

    private void resize() {
        BaseEquipment[] equipArrayTmp = new BaseEquipment[generateNewSize()];

        for (int ptr = 0; ptr < getSize(); ptr++) {
            equipArrayTmp[ptr] = this.get(ptr);
        }

        setEquipArray(equipArrayTmp);
    }

    private int generateNewSize(){
        int newSize;

        if (getSize() < DEFAULT_SIZE) {
            newSize = DEFAULT_NEW_SIZE;
        } else {
            newSize = (int) (getSize() * DEFAULT_RESIZE_FACTOR);
        }
        return newSize;
    }
}
