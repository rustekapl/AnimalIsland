package com.javarush.aleev.island.entities.organismes.animals.carnivores;



import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Wolf",
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


//    public Wolf(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Wolf(Parameters parameters) {
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
}