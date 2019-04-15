package by.epam.javawebtraining.gayduknikita.task1;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.BaseCalculator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.calculator.Calculator;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.factory.EquipmentBuilderFactory;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.AbstractEquipmentBuilder;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.validator.XSDSAXValidator;

public class Main {

    public static void main(String[] args) {

        XSDSAXValidator validator = new XSDSAXValidator();
        System.out.println(validator.isValid("testresources/testxml/testdata.xml"
                , "testresources/testxml/testschema.xsd"));

        EquipmentBuilderFactory factory = new EquipmentBuilderFactory();

        AbstractEquipmentBuilder builder = factory.createEquipmentBuilder("DOM");

        builder.buildEquipmentBag("testresources/testxml/testdata.xml");
        System.out.println(builder.getEquipmentBag());

        Calculator calculator = new BaseCalculator();
        System.out.println(calculator.calculate(builder.getEquipmentBag()));

    }
}