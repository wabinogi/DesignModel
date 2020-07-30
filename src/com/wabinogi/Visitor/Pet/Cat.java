package com.wabinogi.Visitor.Pet;

public class Cat extends Pet {

    public Cat(String Name,String Food)
    {
        this.food = Food;
        this.name = Name;
    }

    @Override
    protected void Eat() {
        System.out.println("Cat is eating ......");
    }

    @Override
    protected int GetPrice() {
        return 100;
    }

    @Override
    public void AcceptAndDoVisit(Visitable visitor) {
        super.AcceptAndDoVisit(visitor);
    }
}
