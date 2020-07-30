package com.wabinogi.Observer_v1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String Message;
    List<Observer> olist;
    public Subject(String message)
    {
        this.Message = message;
        this.olist = new ArrayList<Observer>();
    }

    public void RegisterObserver(Observer observer)
    {
        this.olist.add(observer);
    }

    private void NotifyAllObserver(){

        for(int i =0;i<this.olist.size();i++){
            this.olist.get(i).ReceiveMessage(this);
        }
    }

    public void PublishMessage(){
        System.out.println("Subject Publishing !");
        NotifyAllObserver();
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
