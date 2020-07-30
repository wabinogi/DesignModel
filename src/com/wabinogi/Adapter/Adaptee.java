package com.wabinogi.Adapter;

//被适配者：一个设备，设备上用的是两头插头
public class Adaptee {

    //插头插入接线板供电
    public void TwoPlugConnect()
    {
        System.out.println("Two Plug is Connecting !");
    }

    //业务方法
    //设备工作
    public void EquipmentWork()
    {
        System.out.println("Equipment is Working !");
    }
}
