package com.javarush.aleev.island.parameters;


public class Parameters {
    private final String name;
    private final String icon;
    private final double weight;
    //private final Limit limit;
    private final double maxWeight;
    private final int maxFieldValue;
    private final int speed;
    private final double foodValue;




    public Parameters(String name,
                      String icon,
                      double weight,
                      double maxWeight,
                      int maxFieldValue,
                      int speed,
                      double foodValue) {
        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.maxFieldValue = maxFieldValue;
        this.speed = speed;
        this.foodValue = foodValue;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxFieldValue() {
        return maxFieldValue;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFoodValue() {
        return foodValue;
    }

}
