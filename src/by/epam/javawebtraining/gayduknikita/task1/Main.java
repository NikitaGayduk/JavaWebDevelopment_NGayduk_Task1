package by.epam.javawebtraining.gayduknikita.task1;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.WearDegree;

public class Main {

    public static void main(String[] args) {
        BaseEquipment equip1 = new BaseEquipment();
        BaseEquipment equip2 = new BaseEquipment();
        BaseEquipment equip3 = new BaseEquipment(100, WearDegree.SLIGHTLY_WORN);
        if(equip1.equals(equip3)){
            System.out.println("True");
        }
    }
}
