package com.wabinogi.State;

public class StateG2R extends State {

    @Override
    public void ShowTrafficLight(LightContext light) {
        System.out.println("Yellow light On ！");
        light.setNextState(LightContext.red);
    }
}
