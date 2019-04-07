/*TorsoArmor
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalChestGirthException;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.exception.logicalexception.illegalparameterexception.IllegalWaistGirthException;

import java.util.Objects;

/**
 * The TorsoArmor class is a part of knight
 * armor. Extends ArmorEquipment
 */

public class TorsoArmor extends ArmorEquipment {

    private static final  int DEFAULT_WAIST_GIRTH = 80;
    private static final  int DEFAULT_CHEST_GIRTH = 110;

    private double waistGirth;
    private double chestGirth;



    public TorsoArmor() {
        super();
        waistGirth = DEFAULT_WAIST_GIRTH;
        chestGirth = DEFAULT_CHEST_GIRTH;
    }

    public TorsoArmor(int cost, WearDegree state, int armor, double waistGirth, double chestGirth) {
        super(cost, state, armor);
        if (waistGirth > 0) {
            this.waistGirth = waistGirth;
        } else {
            this.waistGirth = DEFAULT_WAIST_GIRTH;
        }

        if (chestGirth > 0) {
            this.chestGirth = chestGirth;
        } else {
            this.chestGirth = DEFAULT_CHEST_GIRTH;
        }
    }

    public TorsoArmor(TorsoArmor torsoArmor) {
        super(torsoArmor);
        if (torsoArmor != null) {
            this.waistGirth = torsoArmor.waistGirth;
            this.chestGirth = torsoArmor.chestGirth;
        } else {
            this.waistGirth = DEFAULT_WAIST_GIRTH;
            this.chestGirth = DEFAULT_CHEST_GIRTH;
        }
    }



    public void setWaistGirth(double waistGirth) {
        if (waistGirth < 0) {
            this.waistGirth = DEFAULT_WAIST_GIRTH;
        }
        this.waistGirth = waistGirth;
    }

    public double getWaistGirth() {
        return waistGirth;
    }

    public void setChestGirth(double chestGirth) {
        if (chestGirth < 0) {
            this.chestGirth = DEFAULT_CHEST_GIRTH;
        }
        this.chestGirth = chestGirth;
    }

    public double getChestGirth() {
        return chestGirth;
    }

    @Override
    public TorsoArmor getCopy() {
        return new TorsoArmor(this);
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
        TorsoArmor that = (TorsoArmor) o;
        return Double.compare(that.waistGirth, waistGirth) == 0 &&
                Double.compare(that.chestGirth, chestGirth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), waistGirth, chestGirth);
    }

    @Override
    public String toString() {
        return super.toString() + ", waist girth: " + waistGirth
                + ", chest girth: " + chestGirth;
    }
}
