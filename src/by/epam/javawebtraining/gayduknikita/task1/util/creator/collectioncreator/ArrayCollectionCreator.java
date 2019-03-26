package by.epam.javawebtraining.gayduknikita.task1.util.creator.collectioncreator;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.ArrayCollection;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;
import by.epam.javawebtraining.gayduknikita.task1.util.creator.equipmentcreator.*;

import java.util.Random;

public class ArrayCollectionCreator implements CollectionCreator {
    private static Random random = new Random();

    private static EquipmentCreator[] creatorsArray = {
            new BaseEquipmentCreator(),
            new ArmorCreator(),
            new WeaponCreator(),
            new TorsoArmorCreator(),
            new CuttingWeaponCreator()
    };

    @Override
    public Collection factoryMethodRandomFill(int size) {
        Collection collection = new ArrayCollection(size);

        for(int ptr = 0; ptr < collection.getSize(); ptr++){
            collection.add(creatorsArray[random.nextInt(creatorsArray.length)].factoryMethodRandomFill());
        }
        return collection;
    }
}
