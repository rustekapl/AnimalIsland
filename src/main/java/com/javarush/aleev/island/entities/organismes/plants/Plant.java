package com.javarush.aleev.island.entities.organismes.plants;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Plant",
        icon =PLANT_ICON,
        maxWeight = MAX_WEIGHT_PLANT,
        maxFieldValue = MAX_FIELD_VALUE_PLANT,
        speed = SPEED_PLANT,
        foodValue = FOOD_VALUE_PLANT)

public class Plant extends Plants {

//    public Plant(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }


    public Plant(Parameters parameters) {
        super(parameters);
    }

    @Override
    public void reproduct(Cell currentCell) {

    }
}
