package com.wabinogi.ABFactory;

public class MacBook extends Computer {

    @Override
    void ShowBrand() {
        System.out.println("MacBook !");
    }

    @Override
    void Compute() {
        System.out.println("Mac Computing !");
    }
}
