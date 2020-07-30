package com.wabinogi.Bridge;

//维度：Shape
//抽象类，聚合了Color接口
abstract class Shape {
    Color color;
    public abstract void SetColor(Color color);
    public abstract void Draw();
}
