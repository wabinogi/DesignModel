package com.wabinogi.ResChain_v2;

//车轮实体类
public class CarWheel {

    public String brand = "default";
    public int size = 0;

    public CarWheel(){};
    public CarWheel(String brand,int size) {
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
