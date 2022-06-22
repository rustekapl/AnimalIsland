package com.javarush.aleev.island.entities.organismes.animals.carnivores;


import com.javarush.aleev.island.parameters.Parameters;
import com.javarush.aleev.island.entities.organismes.animals.Animal;
import com.javarush.aleev.island.entities.map.Cell;

import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;


public abstract class Carnivore extends Animal{

//    public Carnivore(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
//        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//    }


    public Carnivore(Parameters parameters) {
        super(parameters);
    }

    public abstract void eat(Herbivore herbivore, Cell currentCell);


    public abstract void move(Cell startCell);


    public abstract void reproduct(Cell currentCell);
}
