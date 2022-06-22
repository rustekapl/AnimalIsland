package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.map.Cell;

import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.entities.organismes.animals.Animal;

public abstract class Herbivore extends Animal {


//    public Herbivore(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }

    public Herbivore(Parameters parameters) {
        super(parameters);
    }

    public abstract void eat(Plants plant, Cell currentCell);
    public abstract void move(Cell startCell);
    public abstract void reproduct(Cell currentCell);
}
