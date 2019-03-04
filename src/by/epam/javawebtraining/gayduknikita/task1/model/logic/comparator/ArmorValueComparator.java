package by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;

public class ArmorValueComparator extends BaseParameterComparator<ArmorEquipment> {
    @Override
    public Class<ArmorEquipment> returnComparedClasses() {
        return ArmorEquipment.class;
    }

    @Override
    public int compare(ArmorEquipment equip1, ArmorEquipment equip2) {
        int result;
        if (equip1 == null && equip2 == null) {
            result = 0;
        } else if (equip1 == null) {
            result = -1;
        } else if (equip2 == null) {
            result = 1;
        } else {
            result = Integer.compare(equip1.getArmorValue(),equip2.getArmorValue());
        }
        return result;
    }
}
