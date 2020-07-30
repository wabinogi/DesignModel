package com.wabinogi.ABFactory;

public class Composite_2_Factory extends AbstractCompositeFactory {

    @Override
    public Phone CreatePhone() {
        return new MIphone();
    }

    @Override
    public Computer CreateComputer() {
        return new DELLXPS();
    }
}
