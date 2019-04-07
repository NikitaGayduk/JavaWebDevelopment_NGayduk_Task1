package by.epam.javawebtraining.gayduknikita.task1;


import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.SAXEquipmentBuilder;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.validator.XSDSAXValidator;

public class Main {

    public static void main(String[] args) {
        XSDSAXValidator validator = new XSDSAXValidator();
        SAXEquipmentBuilder parser = new SAXEquipmentBuilder();
        parser.buildEquipmentBag("xml/data.xml");
        System.out.println(validator.isValid("xml/data.xml","xml/schema.xsd"));
        System.out.println(parser.getEquipmentBag());
    }
}