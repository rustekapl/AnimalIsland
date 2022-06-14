package ru.javarush.aleev.animalisland.utils;

import ru.javarush.aleev.animalisland.exception.IslandException;

public class Sleeper {
    private Sleeper() {
    }

    public static void sleep(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new IslandException(e);
        }
    }
}
