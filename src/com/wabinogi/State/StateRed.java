package com.wabinogi.State;

public class StateRed extends State {


    public void ShowTrafficLight(LightContext light) {
        System.out.println("Red light On ！");
        light.setNextState(LightContext.r2g);
    }

}
