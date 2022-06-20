package com.javarush.aleev.island.entities.organismes.animals.carnivores;


import com.javarush.aleev.island.entities.organismes.animals.Animal;
import com.javarush.aleev.island.entities.gamefields.GameCell;

import com.javarush.aleev.island.entities.organismes.animals.herbivores.Herbivore;


public abstract class Carnivore extends Animal{

    public Carnivore(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }

    public abstract void eat(Herbivore herbivore, GameCell currentGameCell);


    public abstract void move(GameCell startGameCell);


    public abstract void reproduct(GameCell currentGameCell);
}
