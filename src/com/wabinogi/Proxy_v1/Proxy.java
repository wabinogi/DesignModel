package com.wabinogi.Proxy_v1;

//代理类
public class Proxy implements Image{

    private Real real;
    public Proxy()
    {
        this.real = new Real();
    }
    @Override
    public void ShowImage() {
        System.out.println("~~~~ Show begin ! ~~~~");
        this.real.ShowImage();
        System.out.println("~~~~ End ! ~~~~");
    }
}
