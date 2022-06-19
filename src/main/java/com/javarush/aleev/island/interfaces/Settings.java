package com.javarush.aleev.island.interfaces;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Settings {
    String name();
    String icon();
    double maxWeight();
    int fieldMaxValue();
    int speed();
    double foodValue();

}
