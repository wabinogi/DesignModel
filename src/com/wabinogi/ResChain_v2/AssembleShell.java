package com.wabinogi.ResChain_v2;

//责任链：装外壳的类
public class AssembleShell implements Assembility {

    private CarShell shell;
    public AssembleShell(CarShell shell) {
        this.shell = shell;
    }

    @Override
    public void Assemble(CarChassis chassis, Boolean enable) {
        if(enable) {
            chassis.setShell(shell);
        }
        chassis.SetBaseCar(chassis);
    }
}
