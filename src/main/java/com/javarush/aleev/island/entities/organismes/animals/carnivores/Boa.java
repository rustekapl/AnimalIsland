package com.javarush.aleev.island.entities.organismes.animals.carnivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.interfaces.Setting;
import static com.javarush.aleev.island.constants.Constants.*;


@Setting(name ="Boa",
        icon =BOA_ICON,
        maxWeight = MAX_WEIGHT_BOA,
        maxFieldValue = MAX_FIELD_VALUE_BOA,
        speed = SPEED_BOA,
        foodValue = FOOD_VALUE_BOA)

public class Boa extends Carnivore {
//
//    Limit limit = new Limit(
//            MAX_WEIGHT_BOA,
//            FIELD_MAX_VALUE_BOA,
//            SPEED_BOA,
//            FOOD_VALUE_BOA);


//    public Boa(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Boa(Parameters parameters) {
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

