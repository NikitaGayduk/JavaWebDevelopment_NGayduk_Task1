package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.handler.EquipmentEnum;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */

public class DOMEquipmentBuilder extends AbstractEquipmentBuilder {
    private static final Logger LOGGER = Logger.getRootLogger();

    private DocumentBuilder docBuilder;

    public DOMEquipmentBuilder() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            LOGGER.error("DOMParser configuration error. " + e.getMessage());
        }
    }

    public DOMEquipmentBuilder(BaseBag equipmentBag){
        super(equipmentBag);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            LOGGER.error("DOMParser configuration error. " + e.getMessage());
        }

    }

    @Override
    public void buildEquipmentBag(String xmlName) {
        Document doc = null;

        try {
            doc = docBuilder.parse(xmlName);
            Element root = doc.getDocumentElement();

            NodeList equipmentList = root.getChildNodes();

            for (int i = 0; i < equipmentList.getLength(); i++) {
                Node node = equipmentList.item(i);

                if (node instanceof Element) {
                    Element equipmentElement = (Element) node;
                    BaseEquipment equipment = buildEquipment(equipmentElement);
                    equipmentBag.add(equipment);
                }
            }
        } catch (IOException e) {
            LOGGER.error("IOException in SAXParser during the parsing. " + e.getMessage());
        } catch (SAXException e) {
            LOGGER.error("SAXParser parsing error. " + e.getMessage());
        }
    }

    private BaseEquipment buildEquipment(Element equipmentElement) {
        BaseEquipment equipment;

        if (EquipmentEnum.BASE_EQUIPMENT.getValue().equals(equipmentElement.getTagName())) {
            equipment = new BaseEquipment();
            setBaseEquipment(equipment, equipmentElement);

        } else if (EquipmentEnum.ARMOR_EQUIPMENT.getValue().equals(equipmentElement.getTagName())) {
            equipment = new ArmorEquipment();
            setArmorEquipment(equipment, equipmentElement);

        } else if (EquipmentEnum.WEAPON_EQUIPMENT.getValue().equals(equipmentElement.getTagName())) {
            equipment = new WeaponEquipment();
            setWeaponEquipment(equipment, equipmentElement);

        } else if (EquipmentEnum.TORSO_ARMOR.getValue().equals(equipmentElement.getTagName())) {
            equipment = new TorsoArmor();
            setTorsoArmor(equipment, equipmentElement);

        } else if (EquipmentEnum.CUTTING_WEAPON.getValue().equals(equipmentElement.getTagName())) {
            equipment = new CuttingWeapon();
            setCuttingWeapon(equipment, equipmentElement);

        } else {
            LOGGER.error("No such element " + equipmentElement.getTagName());
            equipment = null;
        }
        return equipment;
    }

    private void setBaseEquipment(BaseEquipment equipment, Element equipmentElement) {
        equipment.setId(Integer.parseInt(equipmentElement.getAttribute("equipment_ID")));
        equipment.setPrice(Integer.parseInt(getElementTextContent(equipmentElement, EquipmentEnum.PRICE.getValue())));
        equipment.setEquipmentState(BaseEquipment.WearDegree.valueOf(getElementTextContent(equipmentElement
                , EquipmentEnum.STATE.getValue())));
    }

    private void setArmorEquipment(BaseEquipment equipment, Element equipmentElement) {
        setBaseEquipment(equipment, equipmentElement);
        ((ArmorEquipment) equipment).setArmorValue(Integer.parseInt(getElementTextContent(equipmentElement
                , EquipmentEnum.ARMOR.getValue())));
    }

    private void setWeaponEquipment(BaseEquipment equipment, Element equipmentElement) {
        setBaseEquipment(equipment, equipmentElement);
        ((WeaponEquipment) equipment).setDamageValue(Integer.parseInt(getElementTextContent(equipmentElement
                , EquipmentEnum.DAMAGE.getValue())));
    }

    private void setTorsoArmor(BaseEquipment equipment, Element equipmentElement) {
        setArmorEquipment(equipment, equipmentElement);
        ((TorsoArmor) equipment).setChestGirth(Double.parseDouble(getElementTextContent(equipmentElement
                , EquipmentEnum.CHEST_GIRTH.getValue())));
        ((TorsoArmor) equipment).setWaistGirth(Double.parseDouble(getElementTextContent(equipmentElement
                , EquipmentEnum.WAIST_GIRTH.getValue())));
    }

    private void setCuttingWeapon(BaseEquipment equipment, Element equipmentElement) {
        setWeaponEquipment(equipment, equipmentElement);
        ((CuttingWeapon) equipment).setCuttingDamage(Integer.parseInt(getElementTextContent(equipmentElement
                , EquipmentEnum.CUTTING_DAMAGE.getValue())));
    }

    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        return node.getTextContent();
    }
}
