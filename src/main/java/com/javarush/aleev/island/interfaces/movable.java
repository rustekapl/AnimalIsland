package com.javarush.aleev.island.interfaces;

import com.javarush.aleev.island.entities.gamefields.GameCell;

@FunctionalInterface
public interface movable {
    void move(GameCell startGameCell);
}
