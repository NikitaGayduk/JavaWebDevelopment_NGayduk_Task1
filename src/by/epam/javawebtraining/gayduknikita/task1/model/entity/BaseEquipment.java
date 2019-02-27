/*BaseEquipment
 * 1.1
 * 15/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

/**
 * The BaseEquipment class is a basic
 * class for all knight equipment
 */

public class BaseEquipment implements Comparable<BaseEquipment> {

    private int price;
    private WearDegree equipmentState;
    private static int DEFAULT_COST = 200;
    private static WearDegree DEFAULT_STATE = WearDegree.UNBROKEN;


    public enum WearDegree {
        BROKEN,
        THREADBARE,
        SLIGHTLY_WORN,
        UNBROKEN
    }


    public BaseEquipment() {
        price = DEFAULT_COST;
        equipmentState = DEFAULT_STATE;
    }

    public BaseEquipment(int price, WearDegree equipmentState) {
        this.price = price;
        this.equipmentState = equipmentState;
    }

    public BaseEquipment(BaseEquipment equip) {
        price = equip.price;
        equipmentState = equip.equipmentState;
    }


    public void setPrice(int price) {
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

