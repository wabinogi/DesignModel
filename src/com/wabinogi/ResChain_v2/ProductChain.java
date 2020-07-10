package com.wabinogi.ResChain_v2;

import java.util.LinkedList;
import java.util.List;

//生产链，将装轮子、装外壳、喷漆、洗车 四种责任封装
public class ProductChain implements Assembility,Waterbility{

    private List<Assembility> processes_a = new LinkedList<Assembility>();
    private List<Waterbility> processes_b = new LinkedList<Waterbility>();

    ProductChain addAssembleProcess(Assembility process, Boolean enable)
    {
        if(enable)
        processes_a.add(process);
        return this;
    }

    ProductChain addWateringProcess(Waterbility process, Boolean enable)
    {
        if(enable)
        processes_b.add(process);
        return this;
    }

    //生产一辆车
    public void Product(CarChassis chassis)
    {
        this.Assemble(chassis,true);
        this.Watering(chassis,true);
    }

    @Override
    public void Assemble(CarChassis chassis, Boolean enable) {
        if(enable)
        {
            for (Assembility process: processes_a)
            {
                process.Assemble(chassis,enable);
            }
        }
    }

    @Override
    public void Watering(CarChassis chassis, Boolean enable) {
        if(enable)
        {
            for (Waterbility process: processes_b)
            {
                process.Watering(chassis,enable);
            }
        }
    }
}
