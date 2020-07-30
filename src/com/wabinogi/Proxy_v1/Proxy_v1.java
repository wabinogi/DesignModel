package com.wabinogi.Proxy_v1;

//静态代理 DEMO
public class Proxy_v1 {
    public static void main(String[] args) throws InterruptedException {
        //访问者访问代理类，使用相关功能
        Proxy p = new Proxy();
        p.ShowImage();
    }
}
