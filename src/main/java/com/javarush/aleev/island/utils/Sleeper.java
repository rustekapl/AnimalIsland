package com.javarush.aleev.island.utils;

import com.javarush.aleev.island.exception.IslandException;

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
