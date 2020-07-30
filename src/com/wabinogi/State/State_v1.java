package com.wabinogi.State;

//State DEMO
//红绿灯的状态转换以及其行为
//状态转换的规则为：红<->黄<->绿。即红不能直接变为绿。
public class State_v1 {

    public static void main(String[] args) throws InterruptedException {
      /*  //没有使用STATE模式的时候
        Light light = new Light("GREEN");//默认绿灯
        //默认循环15次
        for(int i = 0; i < 15; i++){
            Thread.sleep(300); //睡300
            light.ShowTrafficLight();
        }*/

        //使用State模式
        LightContext light2 = new LightContext(LightContext.green);
        //默认循环15次
        for(int i = 0; i < 15; i++){
            Thread.sleep(300); //睡300
            light2.LightOn();
        }
    }
}
