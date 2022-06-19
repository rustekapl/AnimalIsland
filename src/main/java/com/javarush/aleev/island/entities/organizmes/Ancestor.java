package com.javarush.aleev.island.entities.organizmes;

import com.javarush.aleev.island.constants.limits.Limit;
import com.javarush.aleev.island.interfaces.Reproductable;

import java.util.concurrent.atomic.AtomicLong;


public abstract class Ancestor implements Cloneable, Reproductable {

    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());

    private final long id = idCounter.incrementAndGet();
    private String name;
    private String icon;
    private double weight;
    private Limit limit;

    public Ancestor(String name, String icon, double weight, Limit limit) {
        this.name=name;
        this.icon=icon;
        this.weight=weight;
        this.limit=limit;
    }


    @Override
    public Ancestor clone(){
        try{
            return (Ancestor) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError("cannot clone "+this);
        }
    }

    @Override
    public String toString() {
        return icon;
    }
}
