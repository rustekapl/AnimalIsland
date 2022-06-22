package com.javarush.aleev.island;

import com.javarush.aleev.island.constants.OrganismTypes;
import com.javarush.aleev.island.entities.map.GameMap;
import com.javarush.aleev.island.parameters.GameParameters;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        GameField gameField = new GameField();
//        gameField.initGameField();
//        gameField.print();

GameMap gameMap =new GameMap();

gameMap.gameFieldInit();
gameMap.print();
System.out.println("_____________________");
gameMap.settle();
gameMap.printInfo();

            }
}
