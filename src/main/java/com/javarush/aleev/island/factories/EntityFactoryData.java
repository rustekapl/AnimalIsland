package com.javarush.aleev.island.factories;

import com.javarush.aleev.island.entities.organismes.Organism;
import com.javarush.aleev.island.exception.GameException;
import com.javarush.aleev.island.interfaces.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class EntityFactoryData {

    private EntityFactoryData() {
    }

    static Organism[] createPrototypes(Class<?>[] TYPES) {
        Organism[] organisms = new Organism[TYPES.length];
        int index = 0;
        for (Class<?> type : TYPES) {
            if (type.isAnnotationPresent(Settings.class)) {
                Settings settings = type.getAnnotation(Settings.class);
                String name = settings.name();
                String icon = settings.icon();
                double weight = settings.maxWeight();
                double maxWeight = settings.maxWeight();
                int maxFieldValue = settings.maxFieldValue();
                int speed= settings.speed();
                double foodValue=settings.foodValue();

                organisms[index++] = generatePrototype(type, name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
            }
        }
        return organisms;
    }

    private static Organism generatePrototype(Class<?> type,
                                              String name,
                                              String icon,
                                              double weight,
                                              double maxWeight,
                                              int maxFieldValue,
                                              int speed,
                                              double foodValue) {
        try {
            Constructor<?> constructor = type.getConstructor(String.class, String.class, double.class, double.class, int.class,int.class, double.class);
            return (Organism) constructor.newInstance(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new GameException("not found Entity constructor", e);
        }
    }
}
