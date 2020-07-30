package com.wabinogi.Factory;

public class IPhoneFactory extends AbstractPhoneFactory{

    @Override
    public Phone CreatePhone() {
        return new Iphone();
    }
}
