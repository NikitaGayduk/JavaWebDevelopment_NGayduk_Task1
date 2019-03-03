package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalDamageValueException;

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
        this.damageValue = DEFAULT_DAMAGE;
    }

    public WeaponEquipment(int cost, WearDegree state, int damageValue) {
        super(cost, state);
        if (damageValue < 0) {
            this.damageValue = DEFAULT_DAMAGE;
        } else {
            this.damageValue = damageValue;
        }
    }

    public WeaponEquipment(WeaponEquipment equip) {
        super(equip);
        if (equip == null) {
            this.damageValue = DEFAULT_DAMAGE;
        } else {
            this.damageValue = equip.damageValue;
        }
    }



    public void setDamageValue(int damageValue) throws IllegalDamageValueException {
        if (damageValue < 0) {
            throw new IllegalDamageValueException();
        }
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
