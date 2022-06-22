package com.javarush.aleev.island.entities.map;

import com.javarush.aleev.island.constants.OrganismTypes;
import com.javarush.aleev.island.entities.organismes.Organism;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {
//    private Map<Type, Set<Organism>> residens;
//    private List<GameCell> nextGameCell;

//    @Override
//    public String toString() {
//        return getResidents().values().stream()
//                .filter((list) -> list.size() > 0)
//                .sorted((o1, o2) -> o2.size() - o1.size())
//                .map(list -> list.stream().findAny().get().getClass().getSimpleName().substring(0, 1))
//                .map(Object::toString)
//                .collect(Collectors.joining());
//
//    }


//    ConcurrentHashMap<Herbivore, Integer> herbivores = new ConcurrentHashMap<>(HERBIVORE_VALUE);
//    ConcurrentHashMap<Carnivore, Integer> carnivores = new ConcurrentHashMap<>(CARNIVORE_VALUE);
//    ConcurrentHashMap<Plants, Integer> plants = new ConcurrentHashMap<>(PLANT_VALUE);
//
//    public GameCell(ConcurrentHashMap<Herbivore, Integer> herbivores,
//                    ConcurrentHashMap<Carnivore, Integer> carnivores,
//                    ConcurrentHashMap<Plants, Integer> plants) {
//        this.herbivores = herbivores;
//        this.carnivores = carnivores;
//        this.plants = plants;
//    }
//
//    public GameCell() {
//        System.out.println("Start init GameCell");
//        startInit();
//        System.out.println("Finish init GameCell");
//
//    }
//
//    public void startInit() {
//
//        herbivores.put(new Boar(), Randomizer.get(FIELD_MAX_VALUE_BOAR));
//        herbivores.put(new Buffalo(), Randomizer.get(FIELD_MAX_VALUE_BUFFALO));
//        herbivores.put(new Caterpillar(), Randomizer.get(FIELD_MAX_VALUE_CATERPILLAR));
//        herbivores.put(new Deer(), Randomizer.get(FIELD_MAX_VALUE_DEER));
//        herbivores.put(new Duck(), Randomizer.get(FIELD_MAX_VALUE_DUCK));
//        herbivores.put(new Goat(), Randomizer.get(FIELD_MAX_VALUE_GOAT));
//        herbivores.put(new Horse(), Randomizer.get(FIELD_MAX_VALUE_HORSE));
//        herbivores.put(new Mouse(), Randomizer.get(FIELD_MAX_VALUE_MOUSE));
//        herbivores.put(new Rabbit(), Randomizer.get(FIELD_MAX_VALUE_RABBIT));
//        herbivores.put(new Sheep(), Randomizer.get(FIELD_MAX_VALUE_SHEEP));
//
//        carnivores.put(new Bear(), Randomizer.get(FIELD_MAX_VALUE_BEAR));
//        carnivores.put(new Boa(), Randomizer.get(FIELD_MAX_VALUE_BOA));
//        carnivores.put(new Eagle(), Randomizer.get(FIELD_MAX_VALUE_EAGLE));
//        carnivores.put(new Fox(), Randomizer.get(FIELD_MAX_VALUE_FOX));
//        carnivores.put(new Wolf(), Randomizer.get(FIELD_MAX_VALUE_VOLF));
//
//
//        plants.put(new Plant, Randomizer.get(FIELD_MAX_VALUE_PLANT));
//
//
//        Print.printGameField(herbivores, carnivores, plants);
//    }


    int rows;
    int cols;

    public Cell(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
    }
    public Map<OrganismTypes, Set<Organism>> sets = new HashMap<>();

    public void calculate(){
        for(Map.Entry<OrganismTypes,Set<Organism>> pair: sets.entrySet()){
            Set<Organism> organismSet = pair.getValue();
            for(Organism organism:organismSet){
//                boolean isMoved = organism.move(this);
//                if(isMoved)organismSet.remove(organism);
            }
        }

    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    @Override
    public String toString() {
        return "\t|" + rows +
                "/" + cols +
                "|\t";
    }
}


