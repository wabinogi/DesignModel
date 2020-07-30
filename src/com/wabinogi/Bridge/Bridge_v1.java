package com.wabinogi.Bridge;

//DEMO桥接模式
//Color和抽象类shape 在两个维度上相互组合。
//Color类，在接口中传入Shape对象，修改Shape的对象
//Shape类，聚合了一个Color对象
public class Bridge_v1 {

    public static void main(String[] args) {
        Color black = new Black();
        Color gray = new Gray();
        Color white = new White();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        circle.SetColor(black);
        rectangle.SetColor(gray);
        square.SetColor(white);

        circle.Draw();
        rectangle.Draw();
        square.Draw();
    }
}
