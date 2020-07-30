package com.wabinogi.Observer_v1;

public class ConcreteObserver2 extends Observer{
    @Override
    public void ReceiveMessage(Subject subject) {
        System.out.println("ConcreteObserver2 received message : " + subject.getMessage());
    }
}
