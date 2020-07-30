package com.wabinogi.State;

public class StateR2G extends State {

    @Override
    public void ShowTrafficLight(LightContext light) {
        System.out.println("Yellow light On ！");
        light.setNextState(LightContext.green);
    }
    
}
