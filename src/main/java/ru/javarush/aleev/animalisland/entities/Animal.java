package ru.javarush.aleev.animalisland.entities;

import ru.javarush.aleev.animalisland.interfaces.eatable;
import ru.javarush.aleev.animalisland.interfaces.movable;
import ru.javarush.aleev.animalisland.interfaces.reproductable;

public abstract class Animal implements eatable, movable, reproductable {

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduct() {

    }
}
