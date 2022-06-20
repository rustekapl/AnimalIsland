package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;


@Settings(name ="Goat",
        icon =GOAT_ICON,
        maxWeight = MAX_WEIGHT_GOAT,
        maxFieldValue = MAX_FIELD_VALUE_GOAT,
        speed = SPEED_GOAT,
        foodValue = FOOD_VALUE_GOAT)

public class Goat extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_GOAT,
//            FIELD_MAX_VALUE_GOAT,
//            SPEED_GOAT,
//            FOOD_VALUE_GOAT);

    public Goat(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
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
