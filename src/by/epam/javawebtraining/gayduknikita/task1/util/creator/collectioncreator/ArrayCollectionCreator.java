package by.epam.javawebtraining.gayduknikita.task1.util.creator.collectioncreator;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.*;

import java.util.Random;

public class ArrayCollectionCreator implements CollectionCreator {
    private static int DEFAULT_COUNT_OF_ENTETIES = 5;
    private static Random random = new Random();

    private static EquipmentCreator baseEquipmentCreator = new BaseEquipmentCreator();
    private static EquipmentCreator armorCreator = new ArmorCreator();
    private static EquipmentCreator weaponCreator = new WeaponCreator();
    private static EquipmentCreator torsoArmorCreator = new TorsoArmorCreator();
    private static EquipmentCreator cuttingWeaponCreator = new CuttingWeaponCreator();

    @Override
    public Collection factoryMethodRandomFill(int size) {
        Collection collection = new ArrayCollection(size);

        for(int ptr = 0; ptr < collection.getSize(); ptr++){
            switch(random.nextInt(DEFAULT_COUNT_OF_ENTETIES)){
                case 0 : collection.add(baseEquipmentCreator.factoryMethodRandomFill());
                break;
                case 1 : collection.add(armorCreator.factoryMethodRandomFill());
                break;
                case 2 : collection.add(weaponCreator.factoryMethodRandomFill());
                break;
                case 3 : collection.add(torsoArmorCreator.factoryMethodRandomFill());
                break;
                case 4 : collection.add(cuttingWeaponCreator.factoryMethodRandomFill());
            }
        }
        return collection;
    }
}
