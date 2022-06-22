package com.javarush.aleev.island.interfaces;

import com.javarush.aleev.island.entities.map.Cell;

@FunctionalInterface
public interface Movable {
    void move(Cell startCell);
}
