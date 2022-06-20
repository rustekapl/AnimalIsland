package com.javarush.aleev.island.entities.organismes.animals.carnivores;



import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Eagle",
        icon =EAGLE_ICON,
        maxWeight = MAX_WEIGHT_EAGLE,
        maxFieldValue = MAX_FIELD_VALUE_EAGLE,
        speed = SPEED_EAGLE,
        foodValue = FOOD_VALUE_EAGLE)

public class Eagle extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_EAGLE,
//            FIELD_MAX_VALUE_EAGLE,
//            SPEED_EAGLE,
//            FOOD_VALUE_EAGLE);


    public Eagle(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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