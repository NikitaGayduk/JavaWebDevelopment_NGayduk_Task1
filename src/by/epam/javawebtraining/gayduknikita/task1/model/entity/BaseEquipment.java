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
    private final static int DEFAULT_COST = 200;
    private final static WearDegree DEFAULT_STATE = WearDegree.UNBROKEN;


    public enum WearDegree {

        UNBROKEN,
        SLIGHTLY_WORN,
        THREADBARE,
        BROKEN

    }


    public BaseEquipment() {
        price = DEFAULT_COST;
        equipmentState = DEFAULT_STATE;
    }

    public BaseEquipment(int price, WearDegree equipmentState) {
        this.price = price;
        this.equipmentState = equipmentState;
    }

    // TODO: 18.02.2019 как застраховаться от передачи null в конструктор?
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
        BaseEquipment equip = (BaseEquipment) obj;

        if (super.equals(obj)) {
            return true;
        }
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        return (this.price == equip.getPrice()) && (this.equipmentState == equip.equipmentState);
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + "\n" + "Price: " + price
                + ", wear degree: " + equipmentState;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + price;
        return 31 * result + equipmentState.hashCode();
    }

    @Override
    public int compareTo(BaseEquipment equip) {
        if (equip == null) {
            return 1;
        }
        return Integer.compare(this.price, equip.price);
    }
}

