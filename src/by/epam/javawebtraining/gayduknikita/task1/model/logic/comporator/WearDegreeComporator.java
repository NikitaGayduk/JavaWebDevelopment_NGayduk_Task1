package by.epam.javawebtraining.gayduknikita.task1.model.logic.comporator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Comparator;

public class WearDegreeComporator implements Comparator<BaseEquipment> {

    public Class returnClass(){
        return BaseEquipment.class;
    }

    @Override
    public int compare(BaseEquipment equip1, BaseEquipment equip2) {
        if (equip1 == null && equip2 == null ){
            return 0;
        } else if (equip1 == null ) {
            return -1;
        } else if (equip2 == null ) {
            return 1;
        } else if (equip1.getEquipmentState().ordinal() == equip2.getEquipmentState().ordinal()) {
            return 0;
        } else if (equip1.getEquipmentState().ordinal() > equip2.getEquipmentState().ordinal()){
            return -1;
        } else {
            return 1;
        }

    }
}
