package com.wabinogi.ABFactory;

import com.wabinogi.ABFactory.Phone;

public class MIphone extends Phone {

    @Override
    void ShowColor() {
        System.out.println("My Colour is Red");
    }

    @Override
    void Ring() {
        System.out.println("MIphone rings !");
    }
}
