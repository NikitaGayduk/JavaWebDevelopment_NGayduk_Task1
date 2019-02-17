/*Breastplate
 * 1.0
 * 17/02/2019
 *GaydukNikita
 */

package by.epam.javawebtraining.gayduknikita.task1.model.entity;

/**
 * The Breastplate class is a part of knight
 * armor. Extends ArmorEquipment
 */

public class Breastplate extends ArmorEquipment {

    private double waistGirth;
    private double chestGirth;



    public Breastplate(){
        super();
        waistGirth = 99;
        chestGirth = 99;
    }

    public Breastplate(int cost, WearDegree state, int armor, double waistGirth, double chestGirth) {
        super(cost,state,armor);
        this.waistGirth = waistGirth;
        this.chestGirth = chestGirth;
    }

    public Breastplate(Breastplate breastplate) {
        super(breastplate);
        this.waistGirth = breastplate.waistGirth;
        this.chestGirth = breastplate.chestGirth;
    }

    public double getWaistGirth() {
        return waistGirth;
    }

    public void setWaistGirth(double waistGirth) {
        this.waistGirth = waistGirth;
    }

    public double getChestGirth() {
        return chestGirth;
    }

    public void setChestGirth(double chestGirth) {
        this.chestGirth = chestGirth;
    }

    @Override
    public boolean equals(Object obj) {
        Breastplate breastplate = (Breastplate) obj;
        if ((super.equals(obj)) && (this.waistGirth == breastplate.waistGirth)
                && (this.chestGirth == breastplate.chestGirth) ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", waist girth: " + waistGirth
                + ", chest girth: " + chestGirth;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) waistGirth;
        result = 31 * result + (int) chestGirth;
        return result;
    }
}
