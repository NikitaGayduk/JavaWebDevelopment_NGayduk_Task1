package by.epam.javawebtraining.gayduknikita.task1;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.ArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.DynamicArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.EquipmentSorter;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.BaseEquipmentCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.ArmorCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.TorsoArmorCreator;


public class Main {

    public static void main(String[] args) {
        BaseEquipmentCreator baseCreator1 = new BaseEquipmentCreator();
        ArmorCreator armorCreator1 = new ArmorCreator();
        TorsoArmorCreator torsoArmorCreator = new TorsoArmorCreator();

        BaseEquipment equip1 = baseCreator1.factoryMethodRandomFill();
        BaseEquipment equip2 = armorCreator1.factoryMethodRandomFill();
        BaseEquipment equip3 = torsoArmorCreator.factoryMethodRandomFill();
        BaseEquipment equip4 = torsoArmorCreator.factoryMethodRandomFill();
        BaseEquipment equip5 = baseCreator1.factoryMethodRandomFill();
        BaseEquipment equip6 = baseCreator1.factoryMethodRandomFill();
        BaseEquipment equip7 = armorCreator1.factoryMethodRandomFill();
        BaseEquipment equip8 = torsoArmorCreator.factoryMethodRandomFill();



        Container container = new ArrayContainer(equip1,equip1,equip1,equip7,equip2);
        EquipmentSorter sorter = new EquipmentSorter();
        sorter.sortByType(container,TorsoArmor.class, null);

        for(int ptr = 0; ptr < container.getSize(); ptr++){
            if(container.get(ptr) != null){
                System.out.println(container.get(ptr).toString() + "\n");
            } else {
                System.out.println("Empty\n");
            }
        }

    }

}
