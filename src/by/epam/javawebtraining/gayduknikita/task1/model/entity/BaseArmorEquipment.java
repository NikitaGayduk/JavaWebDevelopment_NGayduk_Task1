/*BaseArmorEquipment
 * 1.0
 * 15/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

/**
 * The BaseArmorEquipment class is a basic
 * class for all knight equipment that is
 * kind of armor. Extends BaseEquipment
 *
 */

public class BaseArmorEquipment extends BaseEquipment {

    private int armorValue;

    public BaseArmorEquipment(){
        super();
        armorValue = 999;
    }

    public BaseArmorEquipment(int cost, WearDegree state, int armor){
        super(cost,state);
        armorValue = armor;
    }

    public BaseArmorEquipment(BaseArmorEquipment equip){
        super(equip);
        armorValue = equip.armorValue;
    }

    public void setArmorValue(int armor) {
        armorValue = armorValue;
    }

    public int getArmorValue() {
        return armorValue;
    }

    @Override
    public boolean equals(Object obj) {
        BaseArmorEquipment equip = (BaseArmorEquipment) obj;
        if ((super.equals(obj)) && (this.armorValue == equip.armorValue)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", armor: " + armorValue;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + armorValue;
    }
}
