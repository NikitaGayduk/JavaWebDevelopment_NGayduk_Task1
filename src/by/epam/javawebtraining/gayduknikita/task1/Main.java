package by.epam.javawebtraining.gayduknikita.task1;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.WearDegree;

public class Main {

    public static void main(String[] args) {

        //Test plug
        BaseEquipment baseEquip1 = new BaseEquipment(30, WearDegree.UNBROKEN);
        BaseArmorEquipment baseArmorEquip1 = new BaseArmorEquipment(50, WearDegree.UNBROKEN,300);

        System.out.println(baseArmorEquip1.toString());
        System.out.println(baseEquip1.hashCode());
        System.out.println(baseArmorEquip1.hashCode());

    }
}
