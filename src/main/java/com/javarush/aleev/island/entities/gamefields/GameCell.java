package com.javarush.aleev.island.entities.gamefields;

import com.javarush.aleev.island.entities.carnivores.*;
import com.javarush.aleev.island.entities.herbivores.*;
import com.javarush.aleev.island.entities.plants.Plant;
import com.javarush.aleev.island.entities.plants.Plants;
import com.javarush.aleev.island.utils.Print;
import com.javarush.aleev.island.utils.Randomizer;
import com.javarush.aleev.island.entities.carnivores.*;
import com.javarush.aleev.island.entities.herbivores.*;
import com.javarush.aleev.island.entities.plants.*;
import com.javarush.aleev.island.utils.*;
import java.util.concurrent.ConcurrentHashMap;
import static com.javarush.aleev.island.constants.Constants.*;

public class GameCell {
    ConcurrentHashMap<Herbivore, Integer> herbivores = new ConcurrentHashMap<>(HERBIVORE_VALUE);
    ConcurrentHashMap<Carnivore, Integer> carnivores = new ConcurrentHashMap<>(CARNIVORE_VALUE);
    ConcurrentHashMap<Plants, Integer> plants = new ConcurrentHashMap<>(PLANT_VALUE);

    public GameCell(ConcurrentHashMap<Herbivore, Integer> herbivores,
                    ConcurrentHashMap<Carnivore, Integer> carnivores,
                    ConcurrentHashMap<Plants, Integer> plants) {
        this.herbivores = herbivores;
        this.carnivores = carnivores;
        this.plants = plants;
    }

    public GameCell() {
        System.out.println("Start init GameCell");
        startInit();
        System.out.println("Finish init GameCell");

    }

    public void startInit() {

        herbivores.put(new Boar(), Randomizer.get(FIELD_MAX_VALUE_BOAR));
        herbivores.put(new Buffalo(), Randomizer.get(FIELD_MAX_VALUE_BUFFALO));
        herbivores.put(new Caterpillar(), Randomizer.get(FIELD_MAX_VALUE_CATERPILLAR));
        herbivores.put(new Deer(), Randomizer.get(FIELD_MAX_VALUE_DEER));
        herbivores.put(new Duck(), Randomizer.get(FIELD_MAX_VALUE_DUCK));
        herbivores.put(new Goat(), Randomizer.get(FIELD_MAX_VALUE_GOAT));
        herbivores.put(new Horse(), Randomizer.get(FIELD_MAX_VALUE_HORSE));
        herbivores.put(new Mouse(), Randomizer.get(FIELD_MAX_VALUE_MOUSE));
        herbivores.put(new Rabbit(), Randomizer.get(FIELD_MAX_VALUE_RABBIT));
        herbivores.put(new Sheep(), Randomizer.get(FIELD_MAX_VALUE_SHEEP));

        carnivores.put(new Bear(), Randomizer.get(FIELD_MAX_VALUE_BEAR));
        carnivores.put(new Boa(), Randomizer.get(FIELD_MAX_VALUE_BOA));
        carnivores.put(new Eagle(), Randomizer.get(FIELD_MAX_VALUE_EAGLE));
        carnivores.put(new Fox(), Randomizer.get(FIELD_MAX_VALUE_FOX));
        carnivores.put(new Volf(), Randomizer.get(FIELD_MAX_VALUE_VOLF));


        plants.put(new Plant(), Randomizer.get(FIELD_MAX_VALUE_PLANT));


        Print.printGameField(herbivores, carnivores, plants);
    }

}

