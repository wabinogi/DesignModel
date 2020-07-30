package com.wabinogi.Visitor.Pet;

//宠物类
public abstract class Pet {

    //宠物属性
     String name;
     String food;

    //吃
    protected void Eat()
    {
        System.out.println("Animal is eating sth ......");
    }

    //价格,默认0
    protected int GetPrice()
    {
        return 0;
    }

    //允许访问（访问接口）
    public void AcceptAndDoVisit(Visitable visitor)
    {
        visitor.VisitPet(this);
    }
}
