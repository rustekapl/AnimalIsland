package com.javarush.aleev.island.entities.organismes.animals;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.Organism;

import com.javarush.aleev.island.interfaces.Eatable;
import com.javarush.aleev.island.interfaces.Movable;
import com.javarush.aleev.island.interfaces.Reproductable;


public abstract class Animal
        extends Organism
        implements Eatable, Movable, Reproductable {

    public Animal(String name, String icon, double weight, double maxWeight, int maxFieldValue, int speed, double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }

    @Override
    public void eat(GameCell currentGameCell) {

    }

    @Override
    public void move(GameCell startGameCell) {

    }

    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}
