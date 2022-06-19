package com.javarush.aleev.island.entities.organizmes.animals.carnivores;


import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Fox",
        icon =FOX_ICON,
        maxWeight = MAX_WEIGHT_FOX,
        fieldMaxValue = FIELD_MAX_VALUE_FOX,
        speed = SPEED_FOX,
        foodValue = FOOD_VALUE_FOX)

public class Fox extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_FOX,
//            FIELD_MAX_VALUE_FOX,
//            SPEED_FOX,
//            FOOD_VALUE_FOX);

    public Fox(String name, String icon, double weight, Limit limit) {
        super(name, icon, weight, limit);
    }

    @Override
    public void eat(Herbivore herbivore, GameCell currentGameCell) {

    }

    @Override
    public void move(GameCell startGameCell) {

    }

    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}