package com.wabinogi.Decorator;

public class DecoratedHuman extends Human{

    protected Human human;

    public DecoratedHuman(Human human)
    {
        this.human = human;
    }

    @Override
    void Smile() {
        human.Smile();
    }

    @Override
    void Cry() {
        human.Cry();
    }

    @Override
    void Speak() {
        human.Speak();
    }
}
