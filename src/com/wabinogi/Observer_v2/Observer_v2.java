package com.wabinogi.Observer_v2;

import com.wabinogi.Observer_v1.ConcreteObserver1;
import com.wabinogi.Observer_v1.ConcreteObserver2;
import com.wabinogi.Observer_v1.Subject;

import java.sql.Time;
import java.util.Date;

//Observer_v2 DEMO
//构建有一个BUTTON类。模拟用户输入后按下按键处理。
//用户输入的信息在环境中通过Button构造函数获得。
public class Observer_v2 {

    public static void main(String[] args) throws InterruptedException {

       Button button = new Button("Custmor Name Lucy");
       //观察者Handler的注册，在业务中，注册的先后顺序应该是固定的、写死的。
        button.RegisterHandlers(new ScreenHandler());
        button.RegisterHandlers(new SoundHandler());
        button.RegisterHandlers(new SaveHandler());

        //用户按下Button触发事件
        //触发后续观察者handlers的处理
        button.ButtonClick();

    }
}
