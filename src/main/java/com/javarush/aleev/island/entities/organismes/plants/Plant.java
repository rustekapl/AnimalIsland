package com.javarush.aleev.island.entities.organismes.plants;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Plant",
        icon =PLANT_ICON,
        maxWeight = MAX_WEIGHT_PLANT,
        maxFieldValue = MAX_FIELD_VALUE_PLANT,
        speed = SPEED_PLANT,
        foodValue = FOOD_VALUE_PLANT)

public class Plant extends Plants {

    public Plant(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }


    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}
