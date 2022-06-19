package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;


@Settings(name="Rabbit",
        icon =RABBIT_ICON,
        maxWeight = MAX_WEIGHT_RABBIT,
        fieldMaxValue = FIELD_MAX_VALUE_RABBIT,
        speed = SPEED_RABBIT,
        foodValue = FOOD_VALUE_RABBIT)

public class Rabbit extends Herbivore{

//    Limit limit = new Limit(
//            MAX_WEIGHT_RABBIT,
//            FIELD_MAX_VALUE_RABBIT,
//            SPEED_RABBIT,
//            FOOD_VALUE_RABBIT);

    public Rabbit(String name, String icon, double weight, Limit limit) {
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
