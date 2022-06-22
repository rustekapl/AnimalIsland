package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Buffalo",
        icon =BUFFALO_ICON,
        maxWeight = MAX_WEIGHT_BUFFALO,
        maxFieldValue = MAX_FIELD_VALUE_BUFFALO,
        speed = SPEED_BUFFALO,
        foodValue = FOOD_VALUE_BUFFALO)

public class Buffalo extends Herbivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_BUFFALO,
//            FIELD_MAX_VALUE_BUFFALO,
//            SPEED_BUFFALO,
//            FOOD_VALUE_BUFFALO);


//    public Buffalo(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Buffalo(Parameters parameters) {
        super(parameters);
    }

    @Override
    public void eat(Plants plant, Cell currentCell) {

    }

    @Override
    public void move(Cell startCell) {

    }

    @Override
    public void reproduct(Cell currentCell) {

    }
}
