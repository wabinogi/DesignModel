package com.wabinogi.Adapter;

//DEMO：对象适配器模式，基于组合持有接口对象
//插头的适配器类
//将二插头转换为三头插头，使得设备可以使用三头插座工作
public class ObjectAdapter implements Target{

    private Adaptee twoPlug;
    public ObjectAdapter(Adaptee twoPlug){
        this.twoPlug = twoPlug;
    }

    @Override
    public void ThreePlugConnect() {
        System.out.println("Three Plug is Connecting !");
    }

    //业务方法
    //沿用原设备工作方法
    public void EquipmentWork()
    {
        twoPlug.EquipmentWork();
    }
}
