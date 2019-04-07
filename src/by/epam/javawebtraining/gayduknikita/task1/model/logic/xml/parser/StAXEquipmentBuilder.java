package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.handler.EquipmentEnum;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.EnumSet;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * @author NikitaGayduk
 * @date 08.04.2019
 */
public class StAXEquipmentBuilder {
    private static final Logger LOGGER = Logger.getRootLogger();

    private BaseBag equipmentBag;
    private EnumSet<EquipmentEnum> types;
    private XMLInputFactory inputFactory;

    public StAXEquipmentBuilder() {
        equipmentBag = new BaseBag();
        types = EnumSet.range(EquipmentEnum.BASE_EQUIPMENT, EquipmentEnum.CUTTING_WEAPON);
        inputFactory = XMLInputFactory.newInstance();
    }

    public BaseBag getEquipmentBag() {
        return equipmentBag;
    }

    public void buildEquipmentBag(String xmlName) {
        String name;

        try (FileInputStream inputStream = new FileInputStream(new File(xmlName))) {
            XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);

            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    name = reader.getLocalName();
                    if (types.contains(EquipmentEnum.valueOf(name.toUpperCase()))) {
                        BaseEquipment equip = buildEquipment(reader);
                        equipmentBag.add(equip);
                    }
                }
            }
        } catch (XMLStreamException e) {
            LOGGER.error("Exception in StAXParser during the parsing. " + e.getMessage());
        } catch (IOException e) {
            LOGGER.error("IOException in StAXParser. " + e.getMessage());
        }
    }

    private BaseEquipment buildEquipment(XMLStreamReader reader) throws XMLStreamException {
        BaseEquipment equipment;

        if (EquipmentEnum.BASE_EQUIPMENT.getValue().equals(reader.getLocalName())) {
            equipment = new BaseEquipment();

        } else if (EquipmentEnum.ARMOR_EQUIPMENT.getValue().equals(reader.getLocalName())) {
            equipment = new ArmorEquipment();

        } else if (EquipmentEnum.WEAPON_EQUIPMENT.getValue().equals(reader.getLocalName())) {
            equipment = new WeaponEquipment();

        } else if (EquipmentEnum.TORSO_ARMOR.getValue().equals(reader.getLocalName())) {
            equipment = new TorsoArmor();

        } else if (EquipmentEnum.CUTTING_WEAPON.getValue().equals(reader.getLocalName())) {
            equipment = new CuttingWeapon();

        } else {
            LOGGER.error("Unknown equipment type " + reader.getLocalName());
            throw new XMLStreamException("Unknown equipment type");
        }

        equipment.setId(Integer.parseInt(reader.getAttributeValue(null, "equipment_ID")));
        String name;

        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();

                    if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.PRICE){
                        equipment.setPrice(Integer.parseInt(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.STATE){
                        equipment.setEquipmentState(BaseEquipment.WearDegree.valueOf(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.ARMOR){
                        ((ArmorEquipment)equipment).setArmorValue(Integer.parseInt(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.DAMAGE){
                        ((WeaponEquipment)equipment).setDamageValue(Integer.parseInt(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.WAIST_GIRTH){
                        ((TorsoArmor)equipment).setWaistGirth(Double.valueOf(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.CHEST_GIRTH){
                        ((TorsoArmor)equipment).setChestGirth(Double.valueOf(getXMLText(reader)));

                    } else if (EquipmentEnum.valueOf(name.toUpperCase()) == EquipmentEnum.CUTTING_DAMAGE){
                        ((CuttingWeapon)equipment).setCuttingDamage(Integer.parseInt(getXMLText(reader)));

                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (types.contains(EquipmentEnum.valueOf(name.toUpperCase()))) {
                        return equipment;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element in tag Student");
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }
}