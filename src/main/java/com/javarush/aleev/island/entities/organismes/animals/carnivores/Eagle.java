package com.javarush.aleev.island.entities.organismes.animals.carnivores;



import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;

@Setting(name ="Eagle",
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


//    public Eagle(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }


    public Eagle(Parameters parameters) {
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