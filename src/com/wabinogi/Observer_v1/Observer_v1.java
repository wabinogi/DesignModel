package com.wabinogi.Observer_v1;

//Observer_v1 DEMO
//Subject为消息发布源。ConcreteObserver1、2位观察者
public class Observer_v1 {

    public static void main(String[] args) throws InterruptedException {
        Subject subject1 = new Subject("Test123");
        subject1.RegisterObserver(new ConcreteObserver1());
        subject1.RegisterObserver(new ConcreteObserver2());
        subject1.PublishMessage();
    }
}
