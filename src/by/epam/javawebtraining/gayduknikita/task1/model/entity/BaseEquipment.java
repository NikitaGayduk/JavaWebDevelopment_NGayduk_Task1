package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalPriceException;

/**
 * The BaseEquipment class is a basic
 * class for all knight equipment
 */

public class BaseEquipment implements Comparable<BaseEquipment> {

    private int price;
    private WearDegree equipmentState;
    private static int DEFAULT_PRICE = 200;
    private static WearDegree DEFAULT_STATE = WearDegree.UNBROKEN;



    public enum WearDegree {
        BROKEN,
        THREADBARE,
        SLIGHTLY_WORN,
        UNBROKEN
    }



    public BaseEquipment() {
        price = DEFAULT_PRICE;
        equipmentState = DEFAULT_STATE;
    }

    public BaseEquipment(int price, WearDegree equipmentState) {
        if(price < 0){
            this.price = DEFAULT_PRICE;
        } else {
            this.price = price;
        }
            this.equipmentState = equipmentState;
    }

    public BaseEquipment(BaseEquipment equip) {
        if(equip == null){
            this.price = DEFAULT_PRICE;
            this.equipmentState = DEFAULT_STATE;
        } else {
            this.price = equip.price;
            this.equipmentState = equip.equipmentState;
        }
    }



    public void setPrice(int price) throws IllegalPriceException {
        if(price < 0){
            throw new IllegalPriceException();
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public void setEquipmentState(WearDegree equipmentState) {
        this.equipmentState = equipmentState;
    }

    public WearDegree getEquipmentState() {
        return equipmentState;
    }


    @Override
    public boolean equals(Object obj) {

        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }

        BaseEquipment equip = (BaseEquipment) obj;

        return (this.price == equip.getPrice()) && (this.equipmentState == equip.equipmentState);
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + price;
        return 31 * result + equipmentState.hashCode();
    }

    @Override
    public int compareTo(BaseEquipment equip) {
        int result;
        if (equip == null) {
            result = 1;
        } else {
            result = Integer.compare(this.price, equip.price);
            if (result == 0) {
                result = this.equipmentState.compareTo(equip.getEquipmentState());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + "\n" + "Price: " + price
                + ", wear degree: " + equipmentState;
    }
}

