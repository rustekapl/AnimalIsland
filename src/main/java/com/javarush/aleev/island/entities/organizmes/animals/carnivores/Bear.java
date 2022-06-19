package com.javarush.aleev.island.entities.organizmes.animals.carnivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Settings;
import static com.javarush.aleev.island.constants.Constants.*;

@Settings(name="Bear",
        icon =BEAR_ICON,
        maxWeight = MAX_WEIGHT_BEAR,
        fieldMaxValue = FIELD_MAX_VALUE_BEAR,
        speed = SPEED_BEAR,
        foodValue = FOOD_VALUE_BEAR)
public class Bear extends Carnivore {
//    Limit limit = new Limit(
//            MAX_WEIGHT_BEAR,
//            FIELD_MAX_VALUE_BEAR,
//            SPEED_BEAR,
//            FOOD_VALUE_BEAR);

    public Bear(String name, String icon, double weight, Limit limit) {
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
