package ru.javarush.aleev.animalisland.entities.carnivores;

import ru.javarush.aleev.animalisland.entities.Animal;
import ru.javarush.aleev.animalisland.entities.herbivores.Herbivore;


abstract class Carnivore extends Animal{

    public abstract void eat(Herbivore herbivore);


    public abstract void move();


    public abstract void reproduct();
}
