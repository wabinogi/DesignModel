package com.wabinogi.Bridge;


public class Black implements Color{

    @Override
    public void PaintShape(Shape shape) {
        System.out.println(shape);
    }

    @Override
    public void PaintColor()
    {
        System.out.print("Black ");
    }
}
