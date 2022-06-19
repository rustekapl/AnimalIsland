package com.javarush.aleev.island.entities.organizmes.animals.carnivores;


import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Eagle",
        icon =EAGLE_ICON,
        maxWeight = MAX_WEIGHT_EAGLE,
        fieldMaxValue = FIELD_MAX_VALUE_EAGLE,
        speed = SPEED_EAGLE,
        foodValue = FOOD_VALUE_EAGLE)

public class Eagle extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_EAGLE,
//            FIELD_MAX_VALUE_EAGLE,
//            SPEED_EAGLE,
//            FOOD_VALUE_EAGLE);

    public Eagle(String name, String icon, double weight, Limit limit) {
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