package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Buffalo",
        icon =BUFFALO_ICON,
        maxWeight = MAX_WEIGHT_BUFFALO,
        fieldMaxValue = FIELD_MAX_VALUE_BUFFALO,
        speed = SPEED_BUFFALO,
        foodValue = FOOD_VALUE_BUFFALO)

public class Buffalo extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_BUFFALO,
//            FIELD_MAX_VALUE_BUFFALO,
//            SPEED_BUFFALO,
//            FOOD_VALUE_BUFFALO);

    public Buffalo(String name, String icon, double weight, Limit limit) {
        super(name, icon, weight, limit);
    }

    @Override
    public void eat(Plants plant, GameCell currentGameCell) {

    }

    @Override
    public void move(GameCell startGameCell) {

    }

    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}
