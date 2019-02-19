package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.BaseEquipment;

import java.util.Random;

class EquipParamRandomize {

    private static Random random = new Random();

    static int getRandInt(int max) {
        return random.nextInt(max);
    }

    static double getRandDouble(int max) {
        return max * random.nextDouble();
    }

    static BaseEquipment.WearDegree getRandWearDegree() {
        int x = random.nextInt(BaseEquipment.WearDegree.values().length);
        return BaseEquipment.WearDegree.values()[x];
    }

}
