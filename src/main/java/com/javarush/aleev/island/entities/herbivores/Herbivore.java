package com.javarush.aleev.island.entities.herbivores;

import com.javarush.aleev.island.entities.plants.Plants;
import com.javarush.aleev.island.entities.Animal;

public abstract class Herbivore extends Animal {


    public abstract void eat(Plants plant);
    public abstract void move();
    public abstract void reproduct();
}
