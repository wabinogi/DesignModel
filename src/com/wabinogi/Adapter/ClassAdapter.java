package com.wabinogi.Adapter;

//类适配器模式，
//基于继承被适配类，
// 实现适配目标接口方法
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void ThreePlugConnect() {
        System.out.println("Three Plug is Connecting !");
    }

    @Override
    public void EquipmentWork() {
        super.EquipmentWork();
    }
}
