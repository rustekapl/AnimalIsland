package com.javarush.aleev.island.entities.organismes.plants;


import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.Organism;
import com.javarush.aleev.island.interfaces.Reproductable;

public abstract class Plants extends Organism implements Reproductable {
    public Plants(String name,
                  String icon,
                  double weight,
                  //Limit limit,
                  double maxWeight,
                  int maxFieldValue,
                  int speed,
                  double foodValue) {
        super(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    }

    @Override
    public void reproduct(GameCell currentGameCell) {

    }
}
