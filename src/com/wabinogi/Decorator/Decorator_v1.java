package com.wabinogi.Decorator;

//装饰器DEMO
//HUMAN:被包装类的基类
//BOY GIRL，被包装类
//DecoratedHuman：装饰器抽象类
//CoolBoy、BeatifulGirl：具体装饰类
public class Decorator_v1 {
    public static void main(String[] args) {
        Girl plainGile = new Girl("Lucy");
        BeatifulGirl beauty = new BeatifulGirl(plainGile);
        beauty.Cry();
        beauty.Smile();
        beauty.Speak();


        Boy plainboy = new Boy("Tom");
        CoolBoy coolBoy = new CoolBoy(plainboy);
        coolBoy.Cry();
        coolBoy.Smile();
        coolBoy.Speak();
    }
}
