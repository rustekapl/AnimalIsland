package com.javarush.aleev.island.entities.organismes.animals.carnivores;



import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name ="Fox",
        icon =FOX_ICON,
        maxWeight = MAX_WEIGHT_FOX,
        maxFieldValue = MAX_FIELD_VALUE_FOX,
        speed = SPEED_FOX,
        foodValue = FOOD_VALUE_FOX)

public class Fox extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_FOX,
//            FIELD_MAX_VALUE_FOX,
//            SPEED_FOX,
//            FOOD_VALUE_FOX);

    public Fox(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
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