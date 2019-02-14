package by.epam.javawebdevelopment.ngayduktask1;

import by.epam.javawebdevelopment.ngayduktask1.model.entity.BaseEquipment;
import by.epam.javawebdevelopment.ngayduktask1.model.entity.WearDegree;

public class Main {

    public static void main(String[] args) {

        //test plug
        BaseEquipment equip1 = new BaseEquipment();
        BaseEquipment equip2 = new BaseEquipment();
        BaseEquipment equip3 = new BaseEquipment(23, WearDegree.SLIGHTLY_WORN);
        equip2 = equip1;

        if(equip1.equals(equip2)){
            System.out.println("Equals");
        }

        if(equip1.equals(equip3)){
            System.out.println("Equals");
        } else {
            System.out.println("Unequals");
        }

    }
}
