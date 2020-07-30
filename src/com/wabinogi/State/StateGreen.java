package com.wabinogi.State;

public class StateGreen extends State {


    @Override
    public void ShowTrafficLight(LightContext light) {
        System.out.println("Green light On ！");
        light.setNextState(LightContext.g2r);
    }

}
