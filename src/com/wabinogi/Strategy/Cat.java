package com.wabinogi.Strategy;


public class Cat {
    public String name;
    public int age;

    Cat(String name,int age)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
