package com.wabinogi.Proxy_v1;

//被代理的目标类
public class Real implements Image{
    @Override
    public void ShowImage() {
        System.out.println("Real Image !");
    }
}
