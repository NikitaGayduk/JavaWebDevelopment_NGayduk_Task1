package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalPriceException;

import java.util.Objects;

/**
 * The BaseEquipment class is a basic
 * class for all knight equipment
 */

public class BaseEquipment implements Comparable<BaseEquipment>{

    private static final int DEFAULT_PRICE = 200;
    private static final WearDegree DEFAULT_STATE = WearDegree.UNBROKEN;

    private int price;
    private WearDegree equipmentState;


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
        if (price > 0) {
            this.price = price;
        } else {
            this.price = DEFAULT_PRICE;
        }
        this.equipmentState = equipmentState;
    }

    public BaseEquipment(BaseEquipment equip) {
        if (equip != null) {
            this.price = equip.price;
            this.equipmentState = equip.equipmentState;
        } else {
            this.price = DEFAULT_PRICE;
            this.equipmentState = DEFAULT_STATE;
        }
    }


    public void setPrice(int price) throws IllegalPriceException {
        if (price < 0) {
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

    public BaseEquipment getCopy(){
        return new BaseEquipment(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseEquipment that = (BaseEquipment) o;
        return price == that.price &&
                equipmentState == that.equipmentState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, equipmentState);
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

