package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */
public class XSDSAXValidator {
    private static final Logger LOGGER = Logger.getRootLogger();

    public boolean isValid(String xmlName, String xsdName){
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(xsdName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(xmlName);
            validator.validate(source);
            LOGGER.trace("File " + xmlName + " corresponds to the scheme " + xsdName);
            return true;
        } catch (SAXException e) {
            LOGGER.trace("File " + xmlName + " validation failed. Reason: " + e.getMessage());
            return false;
        } catch (IOException e) {
            LOGGER.trace("IOException while working with file " + xmlName + ". Reason: " + e.getMessage());
            return false;
        }
    }
}
