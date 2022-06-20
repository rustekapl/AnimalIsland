package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Boar",
        icon =BOAR_ICON,
        maxWeight = MAX_WEIGHT_BOAR,
        maxFieldValue = MAX_FIELD_VALUE_BOAR,
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


    public Boar(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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