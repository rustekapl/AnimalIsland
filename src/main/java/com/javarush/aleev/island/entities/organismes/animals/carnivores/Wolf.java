package com.javarush.aleev.island.entities.organismes.animals.carnivores;



import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Wolf",
        icon =WOLF_ICON,
        maxWeight = MAX_WEIGHT_WOLF,
        maxFieldValue = MAX_FIELD_VALUE_WOLF,
        speed = SPEED_WOLF,
        foodValue = FOOD_VALUE_WOLF)

public class Wolf extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_WOLF,
//            FIELD_MAX_VALUE_WOLF,
//            SPEED_WOLF,
//            FOOD_VALUE_WOLF);


    public Wolf(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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