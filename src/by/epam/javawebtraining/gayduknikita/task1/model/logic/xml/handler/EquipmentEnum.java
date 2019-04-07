package by.epam.javawebtraining.gayduknikita.task1.model.logic.xml.handler;

/**
 * @author NikitaGayduk
 * @date 07.04.2019
 */
public enum EquipmentEnum {
    EQUIPMENT("equipment"),
    BASE_EQUIPMENT("base_equipment"),
    ARMOR_EQUIPMENT("armor_equipment"),
    WEAPON_EQUIPMENT("weapon_equipment"),
    TORSO_ARMOR("torso_armor"),
    CUTTING_WEAPON("cutting_weapon"),
    PRICE("price"),
    STATE("state"),
    ARMOR("armor"),
    DAMAGE("damage"),
    WAIST_GIRTH("waist_girth"),
    CHEST_GIRTH("chest_girth"),
    CUTTING_DAMAGE("cutting_damage");

    private String value;

    private EquipmentEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
