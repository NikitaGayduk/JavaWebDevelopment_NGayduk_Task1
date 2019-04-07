package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.handler;

import java.util.EnumSet;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */
public class SAXEquipmentHandler extends DefaultHandler {
    private static final Logger LOGGER = Logger.getRootLogger();

    private BaseBag equipmentBag;
    private BaseEquipment current;
    private EquipmentEnum currentEnum;
    private EnumSet<EquipmentEnum> types;
    private EnumSet<EquipmentEnum> fields;

    public SAXEquipmentHandler() {
        equipmentBag = new BaseBag();
        types = EnumSet.range(EquipmentEnum.BASE_EQUIPMENT, EquipmentEnum.CUTTING_WEAPON);
        fields = EnumSet.range(EquipmentEnum.PRICE,EquipmentEnum.CUTTING_DAMAGE);
    }

    public BaseBag getEquipmentBag() {
        return equipmentBag;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (EquipmentEnum.BASE_EQUIPMENT.getValue().equals(localName)) {
            current = new BaseEquipment();

        } else if (EquipmentEnum.ARMOR_EQUIPMENT.getValue().equals(localName)) {
            current = new ArmorEquipment();

        } else if (EquipmentEnum.WEAPON_EQUIPMENT.getValue().equals(localName)){
            current = new WeaponEquipment();

        } else if (EquipmentEnum.TORSO_ARMOR.getValue().equals(localName)){
            current = new TorsoArmor();

        } else if (EquipmentEnum.CUTTING_WEAPON.getValue().equals(localName)){
            current = new CuttingWeapon();

        } else {
            EquipmentEnum temp = EquipmentEnum.valueOf(localName.toUpperCase());
            if (fields.contains(temp)) {
                currentEnum = temp;
            }
        }

        if (attrs.getLength() == 1) {
            if (current != null) {
                current.setId(Integer.parseInt(attrs.getValue(0)));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (types.contains(EquipmentEnum.valueOf(localName.toUpperCase()))) {
            equipmentBag.add(current);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length).trim();
        if (currentEnum != null) {
            if(currentEnum == EquipmentEnum.PRICE){
                current.setPrice(Integer.parseInt(s));

            } else if (currentEnum == EquipmentEnum.STATE){
                current.setEquipmentState(BaseEquipment.WearDegree.valueOf(s));

            } else if (currentEnum == EquipmentEnum.ARMOR){
                ((ArmorEquipment)current).setArmorValue(Integer.parseInt(s));

            } else if (currentEnum == EquipmentEnum.DAMAGE){
                ((WeaponEquipment)current).setDamageValue(Integer.parseInt(s));

            } else if (currentEnum == EquipmentEnum.WAIST_GIRTH){
                ((TorsoArmor)current).setWaistGirth(Double.valueOf(s));

            } else if (currentEnum == EquipmentEnum.CHEST_GIRTH){
                ((TorsoArmor)current).setChestGirth(Double.valueOf(s));

            } else if (currentEnum == EquipmentEnum.CUTTING_DAMAGE){
                ((CuttingWeapon)current).setCuttingDamage(Integer.parseInt(s));

            } else {
                throw new EnumConstantNotPresentException(
                        currentEnum.getDeclaringClass(), currentEnum.name());
            }
        }
        currentEnum = null;
    }
}