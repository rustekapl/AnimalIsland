package com.javarush.aleev.island.entities;

import com.javarush.aleev.island.interfaces.eatable;
import com.javarush.aleev.island.interfaces.movable;
import com.javarush.aleev.island.interfaces.reproductable;

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
