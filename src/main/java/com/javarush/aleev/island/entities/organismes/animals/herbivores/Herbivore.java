package com.javarush.aleev.island.entities.organismes.animals.herbivores;


import com.javarush.aleev.island.entities.gamefields.GameCell;

import com.javarush.aleev.island.entities.organismes.plants.Plants;
import com.javarush.aleev.island.entities.organismes.animals.Animal;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }

    public abstract void eat(Plants plant, GameCell currentGameCell);
    public abstract void move(GameCell startGameCell);
    public abstract void reproduct(GameCell currentGameCell);
}
