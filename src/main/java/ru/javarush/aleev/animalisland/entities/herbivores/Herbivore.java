package ru.javarush.aleev.animalisland.entities.herbivores;

import ru.javarush.aleev.animalisland.entities.Animal;
import ru.javarush.aleev.animalisland.entities.plants.Plant;

public abstract class Herbivore extends Animal {


    public abstract void eat(Plant plant);
    public abstract void move();
    public abstract void reproduct();
}
