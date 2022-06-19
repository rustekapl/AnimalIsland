package com.javarush.aleev.island.entities.organizmes.animals.carnivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;


@Settings(name="Boa",
        icon =BOA_ICON,
        maxWeight = MAX_WEIGHT_BOA,
        fieldMaxValue = FIELD_MAX_VALUE_BOA,
        speed = SPEED_BOA,
        foodValue = FOOD_VALUE_BOA)

public class Boa extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_BOA,
//            FIELD_MAX_VALUE_BOA,
//            SPEED_BOA,
//            FOOD_VALUE_BOA);

    public Boa(String name, String icon, double weight, Limit limit) {
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

