package com.wabinogi.Decorator;

//被包装类
public class Girl extends Human{

    public Girl(String name)
    {
        this.name = name;
    }

    @Override
    void Smile() {
        System.out.println("I am " + name + " ,I am smiling !");
    }

    @Override
    void Cry() {
        System.out.println("I am " + name + " ,I am crying !");
    }

    @Override
    void Speak() {
        System.out.println("I am " + name + " ,I am speaking !");
    }
}
