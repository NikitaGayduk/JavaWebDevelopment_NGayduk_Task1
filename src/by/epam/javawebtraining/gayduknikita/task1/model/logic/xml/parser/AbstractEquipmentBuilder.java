package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseBag;

/**
 * @author NikitaGayduk
 * @date 09.04.2019
 */
public abstract class AbstractEquipmentBuilder {
    protected BaseBag equipmentBag;

    public AbstractEquipmentBuilder() {
        equipmentBag = new BaseBag();
    }

    public AbstractEquipmentBuilder(BaseBag equipmentBag) {
        this.equipmentBag = equipmentBag;
    }

    public BaseBag getEquipmentBag() {
        return equipmentBag;
    }

    abstract public void buildEquipmentBag(String xmlName);
}
