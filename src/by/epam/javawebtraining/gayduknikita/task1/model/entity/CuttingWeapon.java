/*CuttingWeapon
 * 1.0
 * 19/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalCuttingDamageException;

import java.util.Objects;

/**
 * The CuttingWeapon class is a basic
 * class for all knight equipment that is
 * kind of cutting weapon. Extends WeaponEquipment
 */

public class CuttingWeapon extends WeaponEquipment {

    private static int DEFAULT_CUTTING_DAMAGE = 30;

    private int cuttingDamage;



    public CuttingWeapon() {
        this.cuttingDamage = DEFAULT_CUTTING_DAMAGE;
    }

    public CuttingWeapon(int cost, WearDegree state, int damage, int cuttingDamage) {
        super(cost, state, damage);
        if (cuttingDamage < 0){
            this.cuttingDamage = DEFAULT_CUTTING_DAMAGE;
        } else {
            this.cuttingDamage = cuttingDamage;
        }
    }

    public CuttingWeapon(CuttingWeapon equip) {
        super(equip);
        if (equip == null){
            this.cuttingDamage = DEFAULT_CUTTING_DAMAGE;
        } else {
            this.cuttingDamage = equip.cuttingDamage;
        }
    }



    public void setCuttingDamage(int cuttingDamage) throws IllegalCuttingDamageException {
        if(cuttingDamage < 0){
            throw new IllegalCuttingDamageException();
        }
        this.cuttingDamage = cuttingDamage;
    }

    public int getCuttingDamage() {
        return cuttingDamage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        CuttingWeapon that = (CuttingWeapon) o;
        return cuttingDamage == that.cuttingDamage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuttingDamage);
    }

    @Override
    public String toString() {
        return super.toString() + ", cutting damage: " + cuttingDamage;
    }
}
