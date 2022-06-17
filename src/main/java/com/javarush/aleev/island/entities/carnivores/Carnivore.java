package com.javarush.aleev.island.entities.carnivores;

import com.javarush.aleev.island.entities.Animal;
import com.javarush.aleev.island.entities.herbivores.Herbivore;


public abstract class Carnivore extends Animal{

    public abstract void eat(Herbivore herbivore);


    public abstract void move();


    public abstract void reproduct();
}
