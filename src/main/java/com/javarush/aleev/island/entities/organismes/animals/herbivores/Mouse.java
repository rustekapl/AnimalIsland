package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Mouse",
        icon =MOUSE_ICON,
        maxWeight = MAX_WEIGHT_MOUSE,
        maxFieldValue = MAX_FIELD_VALUE_MOUSE,
        speed = SPEED_MOUSE,
        foodValue = FOOD_VALUE_MOUSE)

public class Mouse extends Herbivore {

//    Limit limit = new Limit(
//            MAX_WEIGHT_MOUSE,
//            FIELD_MAX_VALUE_MOUSE,
//            SPEED_MOUSE,
//            FOOD_VALUE_MOUSE);

    public Mouse(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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