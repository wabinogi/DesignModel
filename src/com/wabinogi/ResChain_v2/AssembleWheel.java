package com.wabinogi.ResChain_v2;

//责任链：装轮子的类
public class AssembleWheel implements Assembility {
    private CarWheel wheel;

    public AssembleWheel(CarWheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void Assemble(CarChassis chassis, Boolean enable) {
        if(enable) {
            chassis.setWheel(wheel);
        }
        chassis.SetBaseCar(chassis);
    }
}
