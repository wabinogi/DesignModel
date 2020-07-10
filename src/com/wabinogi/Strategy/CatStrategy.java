package com.wabinogi.Strategy;

import java.util.Comparator;

public class CatStrategy implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.age > o2.age) return 1;
        else if (o1.age < o2.age) return -1;
        else return 0;
    }
}
