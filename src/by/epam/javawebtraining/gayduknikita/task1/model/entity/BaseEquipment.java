/*BaseEquipment
 * 1.1
 * 15/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

/**
 * The BaseEquipment class is a basic
 * class for all knight equipment
 *
 */

public class BaseEquipment {

    private int price;
    private WearDegree equipmentState;

    public BaseEquipment(){
        price = 9999;
        equipmentState = WearDegree.UNBROKEN;
    }

    public BaseEquipment(int cost, WearDegree state){
        price = cost;
        equipmentState = state;
    }

    public BaseEquipment(BaseEquipment equip){
        price = equip.price;
        equipmentState = equip.equipmentState;
    }

    public void setPrice(int cost){
        price = cost;
    }

    public int getPrice(){
        return price;
    }

    public void setEquipmentState(WearDegree state){
        equipmentState = state;
    }

    public WearDegree getEquipmentState(){
        return equipmentState;
    }

    @Override
    public boolean equals(Object obj) {
        BaseEquipment equip = (BaseEquipment) obj;

        if(super.equals(obj)){
            return true;
        }
        if((obj == null) || (this.getClass() != obj.getClass())){
            return false;
        }

        if ((this.price == equip.getPrice()) && (this.equipmentState == equip.equipmentState)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getName()+ "\n" + "Price: " + price + ", wear degree: " + equipmentState;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + price;
        result = 31 * result + equipmentState.hashCode();
        return result;
    }
}

