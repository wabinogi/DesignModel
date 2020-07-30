package com.wabinogi.ABFactory;

import com.wabinogi.ABFactory.Phone;

public class Iphone extends Phone {

    @Override
    void ShowColor() {
        System.out.println("My Colour is White");
    }

    @Override
    void Ring() {
        System.out.println("Iphone rings !");
    }
}
