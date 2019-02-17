/*DynamicArrayContainer
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.container;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The DynamicArrayContainer class is a bicycle
 * class that shows my knowledge about dynamic arrays.
 * Extends ArrayContainer
 */

public class DynamicArrayContainer extends ArrayContainer {


    public DynamicArrayContainer(){
        super();
    }

    public DynamicArrayContainer(int size){
        super(size);
    }

    public DynamicArrayContainer(BaseEquipment... equipArray){
        super(equipArray);
    }

    @Override
    public boolean add(BaseEquipment equip) {
        if(this.getPtr() >= equipArray.length){
            resize();
        }
        return super.add(equip);
    }

    private void resize(){
        int newSize;

        if(this.equipArray.length < 40){
            newSize = 50;
        } else {
            newSize = (int) (this.equipArray.length * 1.3);
        }

        BaseEquipment[] equipArrayTmp = new BaseEquipment[newSize];

        for(int ptr = 0; ptr < this.equipArray.length; ptr++){
            equipArrayTmp[ptr] = this.get(ptr);
        }

        this.equipArray = equipArrayTmp;
        System.out.println("Resized");

    }

}
