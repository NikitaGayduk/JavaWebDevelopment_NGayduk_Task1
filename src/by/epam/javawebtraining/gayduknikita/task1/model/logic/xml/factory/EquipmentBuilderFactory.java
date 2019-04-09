package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.factory;

import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.AbstractEquipmentBuilder;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.DOMEquipmentBuilder;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.SAXEquipmentBuilder;
import by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser.StAXEquipmentBuilder;

/**
 * @author NikitaGayduk
 * @date 09.04.2019
 */
public class EquipmentBuilderFactory {
    private enum TypeParser {
        SAX, STAX, DOM
    }
    public AbstractEquipmentBuilder createStudentBuilder(String typeParser) {
        TypeParser type = TypeParser.valueOf(typeParser);
        switch (type) {
            case DOM:
                return new DOMEquipmentBuilder();
            case STAX:
                return new StAXEquipmentBuilder();
            case SAX:
                return new SAXEquipmentBuilder();
            default:
                throw new EnumConstantNotPresentException (type.getDeclaringClass(), type.name());
        }
    }
}
