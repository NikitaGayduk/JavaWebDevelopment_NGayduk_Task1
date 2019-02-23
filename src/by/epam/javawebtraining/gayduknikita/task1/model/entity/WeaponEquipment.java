/*WeaponEquipment
 * 1.0
 * 19/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import java.util.Objects;

/**
 * The DamageEquipment class is a basic
 * class for all knight equipment that is
 * kind of weapon. Extends BaseEquipment
 */

public class WeaponEquipment extends BaseEquipment {

    private int damageValue;
    private static int DEFAULT_DAMAGE = 200;



    public WeaponEquipment() {
        super();
        damageValue = DEFAULT_DAMAGE;
    }

    public WeaponEquipment(int cost, WearDegree state, int damageValue) {
        super(cost, state);
        this.damageValue = damageValue;
    }

    public WeaponEquipment(WeaponEquipment equip) {
        super(equip);
        damageValue = equip.damageValue;
    }



    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WeaponEquipment that = (WeaponEquipment) o;
        return damageValue == that.damageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), damageValue);
    }

    @Override
    public String toString() {
        return super.toString() + ", damage: " + damageValue;
    }
}
