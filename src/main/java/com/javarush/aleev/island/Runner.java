package com.javarush.aleev.island;

import com.javarush.aleev.island.entities.gamefields.GameField;
import com.javarush.aleev.island.entities.organismes.Organism;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
//        GameField gameField = new GameField();
//        gameField.initGameField();
//        gameField.print();

        String path = "com.javarush.aleev.island.entities.organismes";

        Reflections reflections = new Reflections(path);
        Set<Class<? extends Organism>> allClasses =
                reflections.getSubTypesOf(Organism.class);

    }
}
