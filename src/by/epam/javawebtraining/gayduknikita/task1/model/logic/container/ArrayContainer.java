/*ArrayContainer
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.logic.container;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

/**
 * The ArrayContainer class is a bicycle
 * class that shows my knowledge about static arrays.
 * Implements Container
 */

public class ArrayContainer implements Container{

    private int ptr;

    BaseEquipment [] equipArray;

    {
        ptr = 0;
    }


    public ArrayContainer(){
        equipArray= new BaseEquipment[10];
    }

    public ArrayContainer(int size){
        equipArray= new BaseEquipment[size];
    }

    //Do we really need it?
    public ArrayContainer(BaseEquipment[] equipArray) {
        this.equipArray = new BaseEquipment[equipArray.length];

        for(int localPtr = 0; localPtr < this.equipArray.length; localPtr++ ){
            this.equipArray[localPtr] = equipArray[localPtr];
        }

    }



    @Override
    public boolean add(BaseEquipment equip) {
        if(ptr >= equipArray.length){
            return false;
        }
        equipArray[ptr] = equip;
        return true;
    }

    @Override
    public BaseEquipment get(int index) {
        if(index<0 || index >= equipArray.length || equipArray[index] == null ){
            // TODO: 17.02.2019 Надо бы тут что нибудь выбрасывать
        }

        return equipArray[index];
    }

    @Override
    public boolean remove(int index) {
        if(index<0 || index >= equipArray.length || equipArray[index] == null){
            return false;
        }

        /**
         * Replace deleted value by last value
         */
        equipArray[index] = equipArray[ptr - 1];
        equipArray[ptr-1] = null;
        return true;

    }

    @Override
    public void clearAll() {
        for(int localPtr = 0; localPtr < this.equipArray.length; localPtr++){
            equipArray[localPtr] = null;
        }
    }
}
