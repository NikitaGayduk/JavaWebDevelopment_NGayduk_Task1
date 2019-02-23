/*ArmorEquipment
 * 1.0
 * 15/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import java.util.Objects;

/**
 * The ArmorEquipment class is a basic
 * class for all knight equipment that is
 * kind of armor. Extends BaseEquipment
 */

public class ArmorEquipment extends BaseEquipment {

    private int armorValue;
    private static int DEFAULT_ARMOR = 300;


    public ArmorEquipment() {
        super();
        armorValue = DEFAULT_ARMOR;
    }

    public ArmorEquipment(int cost, WearDegree state, int armorValue) {
        super(cost, state);
        this.armorValue = armorValue;
    }

    public ArmorEquipment(ArmorEquipment equip) {
        super(equip);
        armorValue = equip.armorValue;
    }


    public void setArmorValue(int armorValue) {
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
