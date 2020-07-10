package com.wabinogi.Strategy;

import java.util.Comparator;

public class DogStrategy implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.tail > o2.tail) return 1;
        else if (o1.tail < o2.tail) return -1;
        else return 0;
    }
}
