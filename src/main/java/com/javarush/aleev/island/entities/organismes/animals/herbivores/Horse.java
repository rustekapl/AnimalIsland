package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Horse",
        icon =HORSE_ICON,
        maxWeight = MAX_WEIGHT_HORSE,
        maxFieldValue = MAX_FIELD_VALUE_HORSE,
        speed = SPEED_HORSE,
        foodValue = FOOD_VALUE_HORSE)

public class Horse extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_HORSE,
//            FIELD_MAX_VALUE_HORSE,
//            SPEED_HORSE,
//            FOOD_VALUE_HORSE);


    public Horse(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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
