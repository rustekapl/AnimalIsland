package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Boar",
        icon =BOAR_ICON,
        maxWeight = MAX_WEIGHT_BOAR,
        fieldMaxValue = FIELD_MAX_VALUE_BOAR,
        speed = SPEED_BOAR,
        foodValue = FOOD_VALUE_BOAR)

public class Boar extends Herbivore {
//
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_BOAR,
//            FIELD_MAX_VALUE_BOAR,
//            SPEED_BOAR,
//            FOOD_VALUE_BOAR);

    public Boar(String name, String icon, double weight, Limit limit) {
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
