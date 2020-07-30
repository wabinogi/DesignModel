package com.wabinogi.State;

//环境类：这里代表的是状态的主体：灯
//关联state类
public class LightContext {

    static State red = new StateRed();
    static State green = new StateGreen();
    static State r2g = new StateR2G();
    static State g2r = new StateG2R();

    private State state;

    public State getState() {
        return state;
    }

    public void setNextState(State state) {
        this.state = state;
    }

    //灯的初始状态
    public LightContext(State state)
    {
        this.state = state;
    }

    public void LightOn()
    {
        this.state.ShowTrafficLight(this);
    }
}
