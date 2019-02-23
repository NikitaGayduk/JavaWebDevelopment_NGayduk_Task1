package by.epam.javawebtraining.gayduknikita.task1.model.logic.searcher;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.collection.Collection;

import java.util.ArrayList;

public class BaseEquipmentSearcher {

    public static BaseEquipment[] searchByType(Collection collection, Class<? extends BaseEquipment> equipmentType) {

        ArrayList<BaseEquipment> list = new ArrayList<>();

        for (int ptr = 0; ptr < collection.getSize(); ptr++) {
            if (collection.get(ptr) == null) {
                continue;
            }
            if (equipmentType.isAssignableFrom(collection.get(ptr).getClass())) {
                list.add(collection.get(ptr));
            }
        }

        return list.toArray(new BaseEquipment[list.size()]);
    }

    public static BaseEquipment[] searchByArmorValue(Collection collection, int min, int max) {
        BaseEquipment[] array = searchByType(collection, ArmorEquipment.class);

        ArrayList<BaseEquipment> list = new ArrayList<>();

        for (int ptr = 0; ptr < array.length; ptr++) {
            if (((ArmorEquipment) array[ptr]).getArmorValue() > min
                    && ((ArmorEquipment) array[ptr]).getArmorValue() < max) {
                list.add(array[ptr]);
            }
        }

        return list.toArray(new BaseEquipment[list.size()]);
    }
}

