package com.javarush.aleev.island.entities.organismes;


import com.javarush.aleev.island.interfaces.Reproductable;

import java.util.concurrent.atomic.AtomicLong;


public abstract class Organism implements Cloneable, Reproductable {

    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());

    private final long id = idCounter.incrementAndGet();
    private final String type = this.getClass().getSimpleName();
    private final String name;
    private final String icon;
    private final double weight;
    //private final Limit limit;
    private final double maxWeight;
    private final int maxFieldValue;
    private final int speed;
    private final double foodValue;

    public Organism(String name,
                    String icon,
                    double weight,
                    //Limit limit,
                    double maxWeight,
                    int maxFieldValue,
                    int speed,
                    double foodValue) {

        this.name = name;
        this.icon=icon;
        this.weight=weight;
        this.maxWeight = maxWeight;
        this.maxFieldValue = maxFieldValue;
        this.speed = speed;
        this.foodValue = foodValue;
        //this.limit=limit;
    }


    @Override
    public Organism clone(){
        try{
            return (Organism) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError("cannot clone "+this);
        }
    }

    @Override
    public String toString() {
        return icon;
    }
}
