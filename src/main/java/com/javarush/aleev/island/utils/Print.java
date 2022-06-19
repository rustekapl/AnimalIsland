package com.javarush.aleev.island.utils;

import com.javarush.aleev.island.entities.organizmes.animals.carnivores.Carnivore;
import com.javarush.aleev.island.entities.organizmes.animals.herbivores.Herbivore;
import com.javarush.aleev.island.entities.organizmes.plants.Plants;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Print {
    private Print(){}

    public static void printGameField(ConcurrentHashMap<Herbivore, Integer> herbivores,
                               ConcurrentHashMap<Carnivore, Integer> carnivores,
                               ConcurrentHashMap<Plants, Integer> plants) {
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        for (Map.Entry<Herbivore, Integer> entry : herbivores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("_____________________________________________");
        for (Map.Entry<Carnivore, Integer> entry : carnivores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("_____________________________________________");
        for (Map.Entry<Plants, Integer> entry : plants.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
    }
}
