package by.epam.javawebtraining.gayduknikita.task1.Controller;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.comporator.WearDegreeComporator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.ArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.Container;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.container.DynamicArrayContainer;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.EquipmentSorter;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.sorter.Sorter;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.ArmorCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.BaseEquipmentCreator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.Creator;
import by.epam.javawebtraining.gayduknikita.task1.util.Creator.TorsoArmorCreator;


public class Knight {

    public static void main(String[] args) {
        Creator baseCreator = new BaseEquipmentCreator();
        Creator armorCreator = new TorsoArmorCreator();
        Container container = new ArrayContainer();

        BaseEquipment equip1 = baseCreator.factoryMethodRandomFill();
        BaseEquipment equip2 = armorCreator.factoryMethodRandomFill();
        System.out.println(equip1.toString());
        System.out.println(equip2.toString());
        WearDegreeComporator comparator = new WearDegreeComporator();
        System.out.println(comparator.compare(equip1,equip2));

        container.add(equip2);
        if(comparator.returnClass().isAssignableFrom(container.get(0).getClass()) ){
            System.out.println("True");
        }
    }
}