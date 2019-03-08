/*ArmorEquipment
 * 1.0
 * 15/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalArmorValueException;

import java.util.Objects;

/**
 * The ArmorEquipment class is a basic
 * class for all knight equipment that is
 * kind of armor. Extends BaseEquipment
 */

public class ArmorEquipment extends BaseEquipment {

    public static final  int DEFAULT_ARMOR = 300;

    private int armorValue;



    public ArmorEquipment() {
        super();
        this.armorValue = DEFAULT_ARMOR;
    }

    public ArmorEquipment(int cost, WearDegree state, int armorValue) {
        super(cost, state);
        if(armorValue < 0){
            this.armorValue = DEFAULT_ARMOR;
        } else {
            this.armorValue = armorValue;
        }
    }

    public ArmorEquipment(ArmorEquipment equip) {
        super(equip);
        if (equip == null) {
            this.armorValue = DEFAULT_ARMOR;
        } else {
            this.armorValue = equip.armorValue;
        }
    }



    public void setArmorValue(int armorValue) throws IllegalArmorValueException {
        if (armorValue < 0){
            throw new IllegalArmorValueException();
        }
        this.armorValue = armorValue;
    }

    public int getArmorValue() {
        return armorValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArmorEquipment that = (ArmorEquipment) o;
        return armorValue == that.armorValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), armorValue);
    }

    @Override
    public String toString() {
        return super.toString() + ", armor: " + armorValue;
    }
}
