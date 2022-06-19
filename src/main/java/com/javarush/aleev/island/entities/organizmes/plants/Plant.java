package com.javarush.aleev.island.entities.organizmes.plants;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.Ancestor;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Plant",
        icon =PLANT_ICON,
        maxWeight = MAX_WEIGHT_PLANT,
        fieldMaxValue = FIELD_MAX_VALUE_PLANT,
        speed = SPEED_PLANT,
        foodValue = FOOD_VALUE_PLANT)

public class Plant extends Ancestor {

    public Plant(String name, String icon, double weight, Limit limit){
        super(name,icon,weight,limit);

    }
    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}
