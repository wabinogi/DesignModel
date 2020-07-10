package com.wabinogi.ResChain_v2;

//责任链抽象接口，水化作业，包括：喷漆和洗车两种
public interface Waterbility {
    void Watering(CarChassis chassis,Boolean enable);
}
