package com.javarush.aleev.island.constants;



public class Preferences {
    private final double maxWeight;
    private final int maxFieldValue;
    private final int speed;
    private final double foodValue;

    public Preferences(double maxWeight, int maxFieldValue, int speed, double foodValue) {
        this.maxWeight = maxWeight;
        this.maxFieldValue = maxFieldValue;
        this.speed = speed;
        this.foodValue = foodValue;
    }
}
