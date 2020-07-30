package com.wabinogi.Bridge;


public class Circle extends Shape{

    @Override
    public void SetColor(Color color) {
        this.color = color;
    }

    @Override
    public void Draw() {
        this.color.PaintColor();
        this.color.PaintShape(this);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
