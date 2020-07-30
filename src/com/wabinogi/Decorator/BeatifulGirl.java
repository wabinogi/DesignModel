package com.wabinogi.Decorator;

//具体装饰类
public class BeatifulGirl extends DecoratedHuman{

    public BeatifulGirl(Human human) {
        super(human);
    }

    //在原类基础上增加了System.out.println("I am a Beauty !");
    @Override
    void Smile() {
        System.out.println("I am a Beauty !");
        human.Smile();
    }

    @Override
    void Cry() {
        System.out.println("I am a Beauty !");
        human.Cry();
    }

    @Override
    void Speak() {
        System.out.println("I am a Beauty !");
        human.Speak();
    }
}
