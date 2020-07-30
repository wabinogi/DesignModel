package com.wabinogi.Bridge;


public class Gray implements Color{

    @Override
    public void PaintShape(Shape shape) {
        System.out.println(shape);
    }

    @Override
    public void PaintColor()
    {
        System.out.print("Gray ");
    }
}
