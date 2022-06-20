package com.javarush.aleev.island.entities.organismes.animals.carnivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Bear",
        icon =BEAR_ICON,
        maxWeight = MAX_WEIGHT_BEAR,
        maxFieldValue = MAX_FIELD_VALUE_BEAR,
        speed = SPEED_BEAR,
        foodValue = FOOD_VALUE_BEAR)
public class Bear extends Carnivore {
//    Limit limit = new Limit(
//            MAX_WEIGHT_BEAR,
//            FIELD_MAX_VALUE_BEAR,
//            SPEED_BEAR,
//            FOOD_VALUE_BEAR);


    public Bear(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
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
