package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;


@Setting(name ="Rabbit",
        icon =RABBIT_ICON,
        maxWeight = MAX_WEIGHT_RABBIT,
        maxFieldValue = MAX_FIELD_VALUE_RABBIT,
        speed = SPEED_RABBIT,
        foodValue = FOOD_VALUE_RABBIT)

public class Rabbit extends Herbivore{

//    Limit limit = new Limit(
//            MAX_WEIGHT_RABBIT,
//            FIELD_MAX_VALUE_RABBIT,
//            SPEED_RABBIT,
//            FOOD_VALUE_RABBIT);

//    public Rabbit(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Rabbit(Parameters parameters) {
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
