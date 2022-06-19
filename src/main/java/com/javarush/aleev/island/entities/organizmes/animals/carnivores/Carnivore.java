package com.javarush.aleev.island.entities.organizmes.animals.carnivores;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.Animal;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;


public abstract class Carnivore extends Animal{

    public Carnivore(String name, String icon, double weight, Limit limit) {
        super(name, icon, weight, limit);
    }

    public abstract void eat(Herbivore herbivore, GameCell currentGameCell);


    public abstract void move(GameCell startGameCell);


    public abstract void reproduct(GameCell currentGameCell);
}
