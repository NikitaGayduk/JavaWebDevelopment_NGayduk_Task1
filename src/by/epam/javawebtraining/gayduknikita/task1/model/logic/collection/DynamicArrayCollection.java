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


    public DynamicArrayCollection() {
        super();
    }

    public DynamicArrayCollection(int size) {
        super(size);
    }

    @Override
    public boolean add(BaseEquipment equip) {
        if (this.getPtr() >= equipArray.length) {
            resize();
        }
        return super.add(equip);
    }

    private void resize() {
        int newSize;

        if (this.equipArray.length < 40) {
            newSize = 50;
        } else {
            newSize = (int) (this.equipArray.length * 1.3);
        }

        BaseEquipment[] equipArrayTmp = new BaseEquipment[newSize];

        for (int ptr = 0; ptr < this.equipArray.length; ptr++) {
            equipArrayTmp[ptr] = this.get(ptr);
        }

        this.equipArray = equipArrayTmp;

    }

}
