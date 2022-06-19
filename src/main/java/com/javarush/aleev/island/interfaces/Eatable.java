package com.javarush.aleev.island.interfaces;

import com.javarush.aleev.island.entities.gamefields.GameCell;

@FunctionalInterface
public interface Eatable {
    void eat(GameCell currentGameCell);
}
