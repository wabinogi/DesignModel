package com.wabinogi.Observer_v2;


//界面观察者
//收到button的消息后进行处理
public class ScreenHandler extends Handler{

    public void ShowMessageBox(Button.ButtonEvent e)
    {
        System.out.println("Operation Submit ！！！");
        System.out.println("Your input Message is :" + e.getButton().getMessage());
    }

    @Override
    public void HandleEvent(Button.ButtonEvent e) {
        ShowMessageBox(e);
    }

}
