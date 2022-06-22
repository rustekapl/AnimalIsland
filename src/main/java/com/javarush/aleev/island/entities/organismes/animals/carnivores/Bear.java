package com.javarush.aleev.island.entities.organismes.animals.carnivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Bear",
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


//    public Bear(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }


    public Bear(Parameters parameters) {
        super(parameters);
    }

    @Override
    public void eat(Herbivore herbivore, Cell currentCell) {

    }

    @Override
    public void move(Cell startCell) {

    }

    @Override
    public void reproduct(Cell currentCell) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
