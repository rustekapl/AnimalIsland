package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;

import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Caterpillar",
        icon =CATERPILLAR_ICON,
        maxWeight = MAX_WEIGHT_CATERPILLAR,
        fieldMaxValue = FIELD_MAX_VALUE_CATERPILLAR,
        speed = SPEED_CATERPILLAR,
        foodValue = FOOD_VALUE_CATERPILLAR)

public class Caterpillar extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_CATERPILLAR,
//            FIELD_MAX_VALUE_CATERPILLAR,
//            SPEED_CATERPILLAR,
//            FOOD_VALUE_CATERPILLAR);

    public Caterpillar(String name, String icon, double weight, Limit limit) {
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
