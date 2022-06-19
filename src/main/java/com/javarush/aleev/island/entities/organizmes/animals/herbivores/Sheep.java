package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Sheep",
        icon =SHEEP_ICON,
        maxWeight = MAX_WEIGHT_SHEEP,
        fieldMaxValue = FIELD_MAX_VALUE_SHEEP,
        speed = SPEED_SHEEP,
        foodValue = FOOD_VALUE_SHEEP)

public class Sheep extends Herbivore {

//    Limit limit = new Limit(
//            MAX_WEIGHT_SHEEP,
//            FIELD_MAX_VALUE_SHEEP,
//            SPEED_SHEEP,
//            FOOD_VALUE_SHEEP);

    public Sheep(String name, String icon, double weight, Limit limit) {
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
