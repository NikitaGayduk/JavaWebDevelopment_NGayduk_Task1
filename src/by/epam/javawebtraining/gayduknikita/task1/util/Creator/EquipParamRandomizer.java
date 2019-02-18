package by.epam.javawebtraining.gayduknikita.task1.util.Creator;

import by.epam.javawebtraining.gayduknikita.task1.model.entity.WearDegree;

class EquipParamRandomizer {

    public static int getRandInt(int begin, int end){
        return (int) (( Math.random() * (end - begin) ) + begin);
    }

    public static double getRandDouble(int begin, int end){
        return (( Math.random() * (end - begin) ) + begin);
    }

    public static WearDegree getRandWearDegree(){
        int result = (int) (( Math.random() * (4 - 1) ) + 1);

        WearDegree state;

        switch (result){
            case 1: state = WearDegree.UNBROKEN;
                    break;
            case 2: state = WearDegree.SLIGHTLY_WORN;
                    break;
            case 3: state = WearDegree.THREADBARE;
                    break;
            case 4: state = WearDegree.BROKEN;
                    break;
            default: state = WearDegree.UNBROKEN;
                    break;
        }

        return state;
    }

}
