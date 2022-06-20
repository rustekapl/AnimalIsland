package com.javarush.aleev.island.factories;

import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.Organism;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public interface Factory {
    GameCell createGameCell();
   List<Organism> getAllPrototypes();
}
