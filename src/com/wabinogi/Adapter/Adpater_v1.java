package com.wabinogi.Adapter;

//DEMO 对象适配器模式
// 类适配器模式
public class Adpater_v1 {

    public static void main(String[] args) {
        //对象适配器模式
        //oldder two plugs equipment connects and works.
        Adaptee twoplugEquip = new Adaptee();
        twoplugEquip.TwoPlugConnect();
        twoplugEquip.EquipmentWork();

        //After using Adpater, equipment connects with 3 plugs and works well !
        ObjectAdapter threeplugEquip = new ObjectAdapter(twoplugEquip);
        threeplugEquip.ThreePlugConnect();
        threeplugEquip.EquipmentWork();

        //类适配器模式
        System.out.println("----------- Class Adaptor Mode ! ------------");
        ClassAdapter threeplugEquip_1 = new ClassAdapter();
        threeplugEquip_1.ThreePlugConnect();
        threeplugEquip_1.EquipmentWork();
    }
}
