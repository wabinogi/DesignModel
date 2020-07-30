package com.wabinogi.Observer_v1;

public class ConcreteObserver1 extends Observer{

    @Override
    public void ReceiveMessage(Subject subject) {
        System.out.println("ConcreteObserver1 received message : " + subject.getMessage());
    }
}
