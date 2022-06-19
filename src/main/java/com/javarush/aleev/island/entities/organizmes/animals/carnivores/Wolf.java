package com.javarush.aleev.island.entities.organizmes.animals.carnivores;


import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Wolf",
        icon =WOLF_ICON,
        maxWeight = MAX_WEIGHT_WOLF,
        fieldMaxValue = FIELD_MAX_VALUE_WOLF,
        speed = SPEED_WOLF,
        foodValue = FOOD_VALUE_WOLF)

public class Wolf extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_WOLF,
//            FIELD_MAX_VALUE_WOLF,
//            SPEED_WOLF,
//            FOOD_VALUE_WOLF);

    public Wolf(String name, String icon, double weight, Limit limit) {
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