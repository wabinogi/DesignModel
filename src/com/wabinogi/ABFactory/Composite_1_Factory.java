package com.wabinogi.ABFactory;

public class Composite_1_Factory extends AbstractCompositeFactory {

    @Override
    public Phone CreatePhone() {
        return new Iphone();
    }

    @Override
    public Computer CreateComputer() {
        return new MacBook();
    }
}
