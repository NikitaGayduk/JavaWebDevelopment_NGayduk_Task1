package by.epam.javawebtraining.gayduknikita.task1;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.Breastplate;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.ArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.DynamicArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.EquipmentSorter;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.BaseEquipmentCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.ArmorCreator;


public class Main {

    public static void main(String[] args) {
        BaseEquipmentCreator baseCreator1 = new BaseEquipmentCreator();
        ArmorCreator armorCreator1 = new ArmorCreator();

        BaseEquipment equip1 = baseCreator1.factoryMethodRandomFill();
        BaseEquipment equip2 = armorCreator1.factoryMethodRandomFill();
        BaseEquipment equip3 = baseCreator1.factoryMethodRandomFill();

        ArrayContainer container1 = new ArrayContainer(equip1,equip2,equip3);

        container1.get(0).toString();
        container1.get(1).toString();
        container1.get(2).toString();
        container1.get(3).toString();


    }

}
