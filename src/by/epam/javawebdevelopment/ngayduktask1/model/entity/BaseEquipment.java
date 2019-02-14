/*BaseEquipment
 * 1.0
 * 14/02/2019
 *
 */

package by.epam.javawebdevelopment.ngayduktask1.model.entity;

/**
 * The BaseEquipment class is a basic
 * class for all knight equipment
 *
 */

public class BaseEquipment {

    private int price;
    private WearDegree equipmentState;

    public BaseEquipment(){
        price = 100;
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

    public boolean equals(BaseEquipment equip) {
        if(equip == null){
            return false;
        }
        if((this.price == equip.getPrice())
                && (this.equipmentState == equip.getEquipmentState())){
            return true;
        } else {
            return false;
        }
    }

    //public String toString(){
    //
    //}
}

