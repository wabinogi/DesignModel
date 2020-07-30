package com.wabinogi.Factory;

//工厂方法DEMO
public class Factory_v1{

    public static void main(String[] args) {
        //单新增加产品时，只需要增加产品类和工厂类，业务逻辑代码不用改变。（基于业务逻辑代码使用抽象和接口方法）
        AbstractPhoneFactory phoneFactory = new MIPhoneFactory();

        //业务逻辑代码，全是接口、抽象方法
        Phone phone = phoneFactory.CreatePhone();
        phone.Ring();
        phone.ShowColor();

    }

}
