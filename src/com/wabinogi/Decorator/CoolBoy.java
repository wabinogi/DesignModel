package com.wabinogi.Decorator;

//具体装饰类
public class CoolBoy extends DecoratedHuman{

    public CoolBoy(Human human) {
        super(human);
    }

    //在原类基础上增加了System.out.println("I am a CoolBoy !");
    @Override
    void Smile() {
        System.out.println("I am a CoolBoy !");
        human.Smile();
    }

    @Override
    void Cry() {
        System.out.println("I am a CoolBoy !");
        human.Cry();
    }

    @Override
    void Speak() {
        System.out.println("I am a CoolBoy !");
        human.Speak();
    }
}
