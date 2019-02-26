package by.epam.javawebtraining.gayduknikita.task1.model.logic.comporator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.ArmorEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;
import by.epam.javawebtraining.gayduknikita.task1.model.entity.TorsoArmor;

import java.util.Comparator;

public class WearDegreeComporator <T extends BaseEquipment> implements Comparator<T>{

    public Class returnClass() {
        return BaseEquipment.class;
    }
/*
    @Override
    public int compare(BaseEquipment equip1, BaseEquipment equip2) {
        int result;
        if (equip1 == null && equip2 == null) {
            result = 0;
        } else if (equip1 == null) {
            result = -1;
        } else if (equip2 == null) {
            result = 1;
        } else {
            result = equip1.getEquipmentState().compareTo(equip2.getEquipmentState());
        }
        return result;
    }
*/

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
