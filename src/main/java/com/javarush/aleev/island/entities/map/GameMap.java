package com.javarush.aleev.island.entities.map;

import com.javarush.aleev.island.constants.OrganismTypes;
import com.javarush.aleev.island.entities.organismes.Organism;
import com.javarush.aleev.island.entities.organismes.animals.carnivores.*;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.*;
import com.javarush.aleev.island.entities.organismes.plants.Plant;
import com.javarush.aleev.island.parameters.GameParameters;
import com.javarush.aleev.island.utils.Randomizer;

import java.util.HashSet;
import java.util.Set;

import static com.javarush.aleev.island.constants.Constants.*;

public class GameMap {

    int rows = WIDTH_ISLAND;
    int cols = LENGTH_ISLAND;
    public static Cell[][] field = new Cell[WIDTH_ISLAND][LENGTH_ISLAND];

    //вместо initialize()
    public void gameFieldInit(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j]=new Cell(i,j);
            }
        }
    }
    //вместо setLive()
public void settle(){
    for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field[i].length; j++) {

            int num = Randomizer.get(2,MAX_FIELD_VALUE_BEAR);
            Set<Organism> typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Bear(GameParameters.getInstance().getMap().get(OrganismTypes.BEAR)));
            }
            field[i][j].sets.put(OrganismTypes.BEAR,typeSet);

            num = Randomizer.get(2,MAX_FIELD_VALUE_WOLF);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
            typeSet.add(new Wolf(GameParameters.getInstance().getMap().get(OrganismTypes.WOLF)));
            }
            field[i][j].sets.put(OrganismTypes.WOLF,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_BOA);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
            typeSet.add(new Boa(GameParameters.getInstance().getMap().get(OrganismTypes.BOA)));
            }
            field[i][j].sets.put(OrganismTypes.BOA,typeSet);

            num = Randomizer.get(2,MAX_FIELD_VALUE_FOX);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Fox(GameParameters.getInstance().getMap().get(OrganismTypes.FOX)));
            }
            field[i][j].sets.put(OrganismTypes.FOX,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_EAGLE);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Eagle(GameParameters.getInstance().getMap().get(OrganismTypes.EAGLE)));
            }
            field[i][j].sets.put(OrganismTypes.EAGLE,typeSet);

            num = Randomizer.get(2,MAX_FIELD_VALUE_HORSE);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Horse(GameParameters.getInstance().getMap().get(OrganismTypes.HORSE)));
            }
            field[i][j].sets.put(OrganismTypes.HORSE,typeSet);

            num = Randomizer.get(2,MAX_FIELD_VALUE_DEER);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Deer(GameParameters.getInstance().getMap().get(OrganismTypes.DEER)));
            }
            field[i][j].sets.put(OrganismTypes.DEER,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_RABBIT);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Rabbit(GameParameters.getInstance().getMap().get(OrganismTypes.RABBIT)));
            }
            field[i][j].sets.put(OrganismTypes.RABBIT,typeSet);

            num = Randomizer.get(2,MAX_FIELD_VALUE_MOUSE);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Mouse(GameParameters.getInstance().getMap().get(OrganismTypes.MOUSE)));
            }
            field[i][j].sets.put(OrganismTypes.MOUSE,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_GOAT);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Goat(GameParameters.getInstance().getMap().get(OrganismTypes.GOAT)));
            }
            field[i][j].sets.put(OrganismTypes.GOAT,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_SHEEP);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Sheep(GameParameters.getInstance().getMap().get(OrganismTypes.SHEEP)));
            }
            field[i][j].sets.put(OrganismTypes.SHEEP,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_BOAR);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Boar(GameParameters.getInstance().getMap().get(OrganismTypes.BOAR)));
            }
            field[i][j].sets.put(OrganismTypes.BOAR,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_BUFFALO);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Buffalo(GameParameters.getInstance().getMap().get(OrganismTypes.BUFFALO)));
            }
            field[i][j].sets.put(OrganismTypes.BUFFALO,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_DUCK);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Duck(GameParameters.getInstance().getMap().get(OrganismTypes.DUCK)));
            }
            field[i][j].sets.put(OrganismTypes.DUCK,typeSet);


            num = Randomizer.get(2,MAX_FIELD_VALUE_CATERPILLAR);
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Caterpillar(GameParameters.getInstance().getMap().get(OrganismTypes.CATERPILLAR)));
            }
            field[i][j].sets.put(OrganismTypes.CATERPILLAR,typeSet);


            num = MAX_FIELD_VALUE_PLANT;
            typeSet = new HashSet<>();
            for (int k = 0; k < num; k++) {
                typeSet.add(new Plant(GameParameters.getInstance().getMap().get(OrganismTypes.PLANT)));
            }
            field[i][j].sets.put(OrganismTypes.PLANT,typeSet);

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
    public void printInfo(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]+"\t");
                System.out.println(field[i][j].sets);
                System.out.println();
            }
            System.out.println();
        }
    }

    public void makeStep(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j].calculate();
            }

        }
    }







}
