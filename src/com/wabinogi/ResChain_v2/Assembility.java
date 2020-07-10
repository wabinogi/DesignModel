package com.wabinogi.ResChain_v2;

//抽象责任链接口，可组装的，包括装轮子、装外壳
public interface Assembility {
    void Assemble(CarChassis chassis,Boolean enable);
}
