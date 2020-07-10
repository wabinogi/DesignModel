package com.wabinogi.ResChain_v2;

////责任链：喷漆
public class PaintColor implements Waterbility{

    private String colour;

    public PaintColor(String colour) {
        this.colour = colour;
    }

    @Override
    public void Watering(CarChassis chassis, Boolean enable) {
        if(enable) {
            chassis.setColor(colour);
        }
        chassis.SetBaseCar(chassis);
    }
}
