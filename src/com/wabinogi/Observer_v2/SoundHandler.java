package com.wabinogi.Observer_v2;


//声音处理类
//收到button消息后。触发特定音效
public class SoundHandler extends Handler{

    public void Sound(Button.ButtonEvent e)
    {
        //级别为1时，才触发音效
        if(e.getEventLevel().equals("1")) {
            System.out.println("Sounding ！");
        }
    }

    @Override
    public void HandleEvent(Button.ButtonEvent e) {
        Sound(e);
    }
}
