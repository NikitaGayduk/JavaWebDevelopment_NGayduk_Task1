package by.epam.javawebtraining.gayduknikita.task1.model.logic.comparator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Comparator;

public class WearDegreeComparator implements Comparator<BaseEquipment> {

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

}
