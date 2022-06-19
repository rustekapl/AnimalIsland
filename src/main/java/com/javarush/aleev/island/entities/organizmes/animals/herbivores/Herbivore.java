package com.javarush.aleev.island.entities.organizmes.animals.herbivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;
import com.javarush.aleev.island.entities.Animal;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, String icon, double weight, Limit limit) {
        super(name, icon, weight, limit);
    }

    public abstract void eat(Plants plant, GameCell currentGameCell);
    public abstract void move(GameCell startGameCell);
    public abstract void reproduct(GameCell currentGameCell);
}
