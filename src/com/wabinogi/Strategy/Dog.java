package com.wabinogi.Strategy;

public class Dog {
    public String name;
    public int tail;

    Dog(String name,int tail)
    {
        this.tail = tail;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }
}
