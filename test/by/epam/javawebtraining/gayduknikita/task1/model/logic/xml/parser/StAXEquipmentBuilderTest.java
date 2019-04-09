package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.parser;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author NikitaGayduk
 * @date 09.04.2019
 */
public class StAXEquipmentBuilderTest {
    private StAXEquipmentBuilder builder = new StAXEquipmentBuilder();
    private String xmlName = "testresources/testxml/testdata.xml";

    @Test
    public void buildEquipmentBagTest(){
        builder.buildEquipmentBag(xmlName);
        BaseBag testBag = builder.getEquipmentBag();
        assertEquals(DataSetter.getTestData(),testBag);
    }
}