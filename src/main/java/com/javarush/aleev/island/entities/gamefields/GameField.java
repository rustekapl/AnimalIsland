package com.javarush.aleev.island.entities.gamefields;

import static com.javarush.aleev.island.constants.Constants.*;

public class GameField {


    GameCell[][] field = new GameCell[LENGTH_ISLAND][WIDTH_ISLAND];

    public void initGameField(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new GameCell();
            }
        }
    }

    public void print(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);

            }
            System.out.println();
        }
    }


}
