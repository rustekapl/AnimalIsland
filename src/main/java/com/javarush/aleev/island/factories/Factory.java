package com.javarush.aleev.island.factories;

import com.javarush.aleev.island.entities.map.Cell;
import com.javarush.aleev.island.entities.organismes.Organism;

import java.util.List;

public interface Factory {
    Cell createRandomCell();
   List<Organism> getAllPrototypes();
}
