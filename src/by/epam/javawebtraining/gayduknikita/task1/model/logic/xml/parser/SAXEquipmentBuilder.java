package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;

import java.io.IOException;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.handler.SAXEquipmentHandler;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */
public class SAXEquipmentBuilder {
    private static final Logger LOGGER = Logger.getRootLogger();

    private BaseBag equipmentBag;
    private SAXEquipmentHandler handler;
    private XMLReader reader;

    public SAXEquipmentBuilder() {
        handler = new SAXEquipmentHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(handler);
        } catch (SAXException e) {
            LOGGER.error("Reader in SAXParser creation or defining error. " + e.getMessage());
        }
    }

    public BaseBag getEquipmentBag() {
        return equipmentBag;
    }

    public void buildEquipmentBag(String xmlName) {
        try {
            reader.parse(xmlName);
        } catch (SAXException e) {
            LOGGER.error("SAXParser parsing error. " + e.getMessage());
        } catch (IOException e) {
            LOGGER.error("IOException in SAXParser during the parsing. " + e.getMessage());
        }
        equipmentBag = handler.getEquipmentBag();
    }


}