package com.javarush.aleev.island.entities;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organizmes.Ancestor;
import com.javarush.aleev.island.interfaces.Eatable;
import com.javarush.aleev.island.interfaces.Movable;
import com.javarush.aleev.island.interfaces.Reproductable;


public abstract class Animal
        extends Ancestor
        implements Eatable, Movable, Reproductable {

    public Animal(String name, String icon, double weight, Limit limit){
        super(name, icon, weight,limit);
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
