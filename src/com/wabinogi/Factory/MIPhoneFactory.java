package com.wabinogi.Factory;

public class MIPhoneFactory extends AbstractPhoneFactory{

    @Override
    public Phone CreatePhone() {
        return new MIphone();
    }
}
