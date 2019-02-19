/*WeaponEquipment
 * 1.0
 * 19/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

/**
 * The DamageEquipment class is a basic
 * class for all knight equipment that is
 * kind of weapon. Extends BaseEquipment
 */

public class WeaponEquipment extends BaseEquipment {

    private int damageValue;
    private final static int DEFAULT_DAMAGE = 200;


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
    public boolean equals(Object obj) {
        WeaponEquipment equip = (WeaponEquipment) obj;
        return (super.equals(obj)) && (this.damageValue == equip.damageValue);
    }

    @Override
    public String toString() {
        return super.toString() + ", armor: " + damageValue;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + damageValue;
    }
}
