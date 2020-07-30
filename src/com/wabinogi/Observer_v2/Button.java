package com.wabinogi.Observer_v2;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Button类
//模拟输入信息后，按下按钮触发事件的过程
//假设：inputMessage为按键时，从UI中获取的用户输入信息
public class Button {

    private String message;
    List<Handler> handlerList;

    public Button(String inputMessage){
        this.handlerList = new ArrayList<Handler>();
        this.message = inputMessage;
    }

    //构造函数中需要输入用户的在界面输入的信息
    public void RegisterHandlers(Handler Handler)
    {
        this.handlerList.add(Handler);
    }

    public void ButtonClick()
    {
        ButtonEvent event = new ButtonEvent("1",this);
        this.NotifyAllHandlers(event);
    }

    private void NotifyAllHandlers(ButtonEvent e)
    {
        for(int i=0;i<this.handlerList.size();i++){
            this.handlerList.get(i).HandleEvent(e);
        }
    }

    public String getMessage() {
        return message;
    }


    //Button内部封装的事件ButtonEvent
    //包括了事件本身及相关上下文信息
    public class ButtonEvent{

        //触发时间
        private long timeStamp;
        //事件级别
        private String eventLevel;
        private Button button;

        ButtonEvent(String eventLevel,Button button)
        {
            this.button = button;
            this.eventLevel = eventLevel;
            this.timeStamp = new Date().getTime();
        }

        public long getTimeStamp() {
            return timeStamp;
        }

        public String getEventLevel() {
            return eventLevel;
        }

        public Button getButton() {
            return button;
        }
    }

}
