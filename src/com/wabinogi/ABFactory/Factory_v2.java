package com.wabinogi.ABFactory;

import com.wabinogi.ABFactory.AbstractCompositeFactory;

//抽象工厂DEMO
public class Factory_v2 {

    public static void main(String[] args) {
        //定制生产产品组合的具体工厂Comsite1/2
        AbstractCompositeFactory package1 = new Composite_1_Factory();
        AbstractCompositeFactory package2 = new Composite_2_Factory();

        //下面的代码属于业务代码，具体产品、产品组合的改动不会导致业务代码改变
        //生产产品组合
        Phone myphone = package1.CreatePhone();
        Computer myComputer = package1.CreateComputer();

        //生产产品组合
        Phone yourphone = package2.CreatePhone();
        Computer yourComputer = package2.CreateComputer();

        //业务代码
        myphone.Ring();
        myphone.ShowColor();
        myComputer.Compute();
        myComputer.ShowBrand();

        yourphone.Ring();
        yourphone.ShowColor();
        yourComputer.Compute();
        yourComputer.ShowBrand();
    }
}
