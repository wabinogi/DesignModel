package com.wabinogi.ResChain_v2;

//责任链：洗车
public class CleanCar implements Waterbility{

    @Override
    public void Watering(CarChassis chassis, Boolean enable) {
        if(enable) {
            chassis.setCon(CarChassis.Condition.CLEAN);
        }
        chassis.SetBaseCar(chassis);
    }
}
