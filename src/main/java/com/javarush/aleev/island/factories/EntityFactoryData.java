package com.javarush.aleev.island.factories;


import com.javarush.aleev.island.entities.organismes.Organism;
import com.javarush.aleev.island.exception.GameException;
import com.javarush.aleev.island.interfaces.Setting;
import com.javarush.aleev.island.utils.Randomizer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;



public class EntityFactoryData {

    public EntityFactoryData() {
    }

//    static Parameters plantParameters = new Parameters(NAME_PLANT, PLANT_ICON, MAX_WEIGHT_PLANT, MAX_WEIGHT_PLANT, MAX_FIELD_VALUE_PLANT, SPEED_PLANT, FOOD_VALUE_PLANT);
//    static Parameters bearParameters = new Parameters(NAME_BEAR, BEAR_ICON, MAX_WEIGHT_BEAR, MAX_WEIGHT_BEAR, MAX_FIELD_VALUE_BEAR, SPEED_BEAR, FOOD_VALUE_BEAR);
//    static Parameters boaParameters = new Parameters(NAME_BOA, BOA_ICON, MAX_WEIGHT_BOA, MAX_WEIGHT_BOA, MAX_FIELD_VALUE_BOA, SPEED_BOA, FOOD_VALUE_BOA);
//    static Parameters eagleParameters = new Parameters(NAME_EAGLE, EAGLE_ICON, MAX_WEIGHT_EAGLE, MAX_WEIGHT_EAGLE, MAX_FIELD_VALUE_EAGLE, SPEED_EAGLE, FOOD_VALUE_EAGLE);
//    static Parameters foxParameters = new Parameters(NAME_FOX, FOX_ICON, MAX_WEIGHT_FOX, MAX_WEIGHT_FOX, MAX_FIELD_VALUE_FOX, SPEED_FOX, FOOD_VALUE_FOX);
//    static Parameters wolfParameters = new Parameters(NAME_WOLF, WOLF_ICON, MAX_WEIGHT_WOLF, MAX_WEIGHT_WOLF, MAX_FIELD_VALUE_WOLF, SPEED_WOLF, FOOD_VALUE_WOLF);
//    static Parameters boarParameters = new Parameters(NAME_BOAR, BOAR_ICON, MAX_WEIGHT_BOAR, MAX_WEIGHT_BOAR, MAX_FIELD_VALUE_BOAR, SPEED_BOAR, FOOD_VALUE_BOAR);
//    static Parameters buffaloParameters = new Parameters(NAME_BUFFALO, BUFFALO_ICON, MAX_WEIGHT_BUFFALO, MAX_WEIGHT_BUFFALO, MAX_FIELD_VALUE_BUFFALO, SPEED_BUFFALO, FOOD_VALUE_BUFFALO);
//    static Parameters caterpillarParameters = new Parameters(NAME_CATERPILLAR, CATERPILLAR_ICON, MAX_WEIGHT_CATERPILLAR, MAX_WEIGHT_CATERPILLAR, MAX_FIELD_VALUE_CATERPILLAR, SPEED_CATERPILLAR, FOOD_VALUE_CATERPILLAR);
//    static Parameters deerParameters = new Parameters(NAME_DEER, DEER_ICON, MAX_WEIGHT_DEER, MAX_WEIGHT_DEER, MAX_FIELD_VALUE_DEER, SPEED_DEER, FOOD_VALUE_DEER);
//    static Parameters duckParameters = new Parameters(NAME_DUCK, DUCK_ICON, MAX_WEIGHT_DUCK, MAX_WEIGHT_DUCK, MAX_FIELD_VALUE_DUCK, SPEED_DUCK, FOOD_VALUE_DUCK);
//    static Parameters goatParameters = new Parameters(NAME_GOAT, GOAT_ICON, MAX_WEIGHT_GOAT, MAX_WEIGHT_GOAT, MAX_FIELD_VALUE_GOAT, SPEED_GOAT, FOOD_VALUE_GOAT);
//    static Parameters horseParameters = new Parameters(NAME_HORSE, HORSE_ICON, MAX_WEIGHT_HORSE, MAX_WEIGHT_HORSE, MAX_FIELD_VALUE_HORSE, SPEED_HORSE, FOOD_VALUE_HORSE);
//    static Parameters mouseParameters = new Parameters(NAME_MOUSE, MOUSE_ICON, MAX_WEIGHT_MOUSE, MAX_WEIGHT_MOUSE, MAX_FIELD_VALUE_MOUSE, SPEED_MOUSE, FOOD_VALUE_MOUSE);
//    static Parameters rabbitParameters = new Parameters(NAME_RABBIT, RABBIT_ICON, MAX_WEIGHT_RABBIT, MAX_WEIGHT_RABBIT, MAX_FIELD_VALUE_RABBIT, SPEED_RABBIT, FOOD_VALUE_RABBIT);
//    static Parameters sheepParameters = new Parameters(NAME_SHEEP, SHEEP_ICON, MAX_WEIGHT_SHEEP, MAX_WEIGHT_SHEEP, MAX_FIELD_VALUE_SHEEP, SPEED_SHEEP, FOOD_VALUE_SHEEP);


//static Parameters getParameters(Class<?> types){
//
//    Setting setting = types.getAnnotation(Setting.class);
//    String name = setting.name();
//    String icon = setting.icon();
//    double maxWeight = setting.maxWeight();
//    double weight = Randomizer.get(maxWeight/2, maxWeight);
//    int maxFieldValue = setting.maxFieldValue();
//    int speed = setting.speed();
//    double foodValue = setting.foodValue();
//    Parameters parameters = new Parameters(generateOrganism(types,name,icon,weight,maxWeight,maxFieldValue,speed,foodValue));
//    return parameters;
//
//}

static Set<?> createOrganismSet(Class<?> types){
    Set<Organism> organismSet = new HashSet<>();

    Setting setting = types.getAnnotation(Setting.class);
    int count = Randomizer.get(setting.maxFieldValue());

    for (int i = 0; i < count; i++) {


    String name = setting.name();
    String icon = setting.icon();
    double maxWeight = setting.maxWeight();
    double weight = Randomizer.get(maxWeight/2, maxWeight);
    int maxFieldValue = setting.maxFieldValue();
    int speed = setting.speed();
    double foodValue = setting.foodValue();

    //organismSet.add(generateOrganism(types,name,icon,weight,maxWeight,maxFieldValue,speed,foodValue));
}

    return organismSet;
}
public static Organism generateOrganism(Class<Organism> types,
                                        String name,
                                        String icon,
                                        double weight,
                                        double maxWeight,
                                        int maxFieldValue,
                                        int speed,
                                        double foodValue) {
    try {
        Constructor<?> constructor = types.getConstructor(String.class, String.class, double.class, double.class, int.class, int.class, double.class);
        return (Organism) constructor.newInstance(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
    } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
        throw new GameException("not found Entity constructor", e);
    }

//    static Organism[] createPrototypes(Class<?>[] TYPES) {
//        Organism[] organisms = new Organism[TYPES.length];
//        int index = 0;
//        for (Class<?> type : TYPES) {
//            if (type.isAnnotationPresent(Settings.class)) {
//                Settings settings = type.getAnnotation(Settings.class);
//                String name = settings.name();
//                String icon = settings.icon();
//                double weight = settings.maxWeight();
//                double maxWeight = settings.maxWeight();
//                int maxFieldValue = settings.maxFieldValue();
//                int speed= settings.speed();
//                double foodValue=settings.foodValue();
//
//                organisms[index++] = generatePrototype(type, name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//            }
//        }
//        return organisms;
//    }
//
//    private static Organism generatePrototype(Class<?> type,
//                                              String name,
//                                              String icon,
//                                              double weight,
//                                              double maxWeight,
//                                              int maxFieldValue,
//                                              int speed,
//                                              double foodValue) {
//        try {
//            Constructor<?> constructor = type.getConstructor(String.class, String.class, double.class, double.class, int.class,int.class, double.class);
//            return (Organism) constructor.newInstance(name, icon, weight, maxWeight, maxFieldValue, speed, foodValue);
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            throw new GameException("not found Entity constructor", e);
//        }
//    }

}
}
