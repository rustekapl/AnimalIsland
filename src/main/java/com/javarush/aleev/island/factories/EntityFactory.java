package com.javarush.aleev.island.factories;

import com.javarush.aleev.island.entities.gamefields.GameCell;
import com.javarush.aleev.island.entities.organismes.Organism;
import com.javarush.aleev.island.entities.organismes.animals.carnivores.*;
import com.javarush.aleev.island.entities.organismes.animals.herbivores.*;
import com.javarush.aleev.island.entities.organismes.plants.Plant;
import com.javarush.aleev.island.entities.organismes.animals.*;
import com.javarush.aleev.island.utils.Randomizer;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityFactory implements Factory {

    private static final Class<?>[] TYPES = {Plant.class, Bear.class, Boa.class, Eagle.class, Fox.class, Wolf.class,
            Boar.class, Buffalo.class, Caterpillar.class, Deer.class, Duck.class,
            Goat.class, Horse.class, Mouse.class, Rabbit.class, Sheep.class};
    private static final Organism[] PROTOTYPES = EntityFactoryData.createPrototypes(TYPES);

    public EntityFactory(){}

    @Override
    public GameCell createGameCell() {
        Map<Type, Set<Organism>> residens = new HashMap<>();
        for(Organism prototype:PROTOTYPES){
            Type type = prototype.getClass();
            residens.putIfAbsent(type,new HashSet<>());
            Set<Organism> organisms = residens.get(prototype.getClass());

            int count = Randomizer.get(prototype.);
        }
        return null;
    }

    @Override
    public CopyOnWriteArrayList<Organism> getAllPrototypes() {
        return null;
    }
}
