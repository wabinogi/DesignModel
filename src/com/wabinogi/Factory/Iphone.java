package com.wabinogi.Factory;

public class Iphone extends Phone{

    @Override
    void ShowColor() {
        System.out.println("My Colour is White");
    }

    @Override
    void Ring() {
        System.out.println("Iphone rings !");
    }
}
