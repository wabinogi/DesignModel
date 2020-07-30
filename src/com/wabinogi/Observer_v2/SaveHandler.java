package com.wabinogi.Observer_v2;


//触发存储
public class SaveHandler extends Handler{

    public void Save(Button.ButtonEvent e)
    {
        System.out.println("Saving Time is : " + e.getTimeStamp());
        System.out.println("System Saved Message :" + e.getButton().getMessage());
    }

    @Override
    public void HandleEvent(Button.ButtonEvent e) {
        Save(e);
    }
}
