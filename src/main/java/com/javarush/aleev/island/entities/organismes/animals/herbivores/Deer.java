package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Deer",
        icon =DEER_ICON,
        maxWeight = MAX_WEIGHT_DEER,
        maxFieldValue = MAX_FIELD_VALUE_DEER,
        speed = SPEED_DEER,
        foodValue = FOOD_VALUE_DEER)

public class Deer extends Herbivore {

//    Limit limit = new Limit(
//            MAX_WEIGHT_DEER,
//            FIELD_MAX_VALUE_DEER,
//            SPEED_DEER,
//            FOOD_VALUE_DEER);

//    public Deer(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Deer(Parameters parameters) {
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
