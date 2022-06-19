package com.javarush.aleev.island.constants.limits;

public class Limit {
    private double maxWeight;
    private int fieldMaxValue;
    private int speed;
    private double foodValue;

    public Limit(double maxWeight, int fieldMaxValue, int speed, double foodValue) {
        this.maxWeight = maxWeight;
        this.fieldMaxValue = fieldMaxValue;
        this.speed = speed;
        this.foodValue = foodValue;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setFieldMaxValue(int fieldMaxValue) {
        this.fieldMaxValue = fieldMaxValue;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFoodValue(double foodValue) {
        this.foodValue = foodValue;
    }
}
