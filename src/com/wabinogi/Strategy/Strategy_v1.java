package com.wabinogi.Strategy;
//策略模式，实现Comparable接口的compareTo方法

import java.util.Comparator;

public class Strategy_v1 {
    //定义比较猫的策略
    static Comparator cat_strategy = new CatStrategy();

    //定义比较狗的策略
    static Comparator dog_strategy = new DogStrategy();
    public static void main(String[] args) {
        Cat c1 = new Cat("Mimi",20);
        Cat c2 = new Cat("OldDriver",40);
        //调用通用业务方法
        BusinessMethod(cat_strategy,c1,c2);

        Dog d1 = new Dog("WangWang",1);
        Dog d2 = new Dog("LongTailer",3);
        //调用通用业务方法
        BusinessMethod(dog_strategy,d1,d2);

    }

    //业务方法中只需要传递 策略类，计算对象
    public static void BusinessMethod(Comparator strategy, Object o1,Object o2)
    {
       if(strategy.compare(o1,o2) > 0) System.out.println("Bigger is " + o1.toString());
       else if(strategy.compare(o1,o2) < 0) System.out.println("Bigger is " + o2.toString());
       else  System.out.println("Equal !");
    }
}
