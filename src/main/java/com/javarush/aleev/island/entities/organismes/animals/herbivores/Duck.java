package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Duck",
        icon =DUCK_ICON,
        maxWeight = MAX_WEIGHT_DUCK,
        maxFieldValue = MAX_FIELD_VALUE_DUCK,
        speed = SPEED_DUCK,
        foodValue = FOOD_VALUE_DUCK)

public class Duck extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_DUCK,
//            FIELD_MAX_VALUE_DUCK,
//            SPEED_DUCK,
//            FOOD_VALUE_DUCK);

    public Duck(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }

    public void eat(Caterpillar caterpillar, GameCell currentGameCell){

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
