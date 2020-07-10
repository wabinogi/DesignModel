package com.wabinogi.ResChain_v2;

//车的底盘类，有四个属性，需要都装上才是完整的车
public class CarChassis {

    private CarChassis baseCar;
    public CarChassis()
    {
        baseCar = this;
    }

    public void SetBaseCar(CarChassis baseCar)
    {
        this.baseCar = baseCar;
    }

    public CarShell getShell() {
        return shell;
    }

    public void setShell(CarShell shell) {
        this.shell = shell;
    }

    private CarShell shell;

    public CarWheel getWheel() {
        return wheel;
    }

    public void setWheel(CarWheel wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private CarWheel wheel;

    public Condition getCon() {
        return con;
    }

    public void setCon(Condition con) {
        this.con = con;
    }

    private String color;

    private Condition con = Condition.DIRTY;

    public static enum Condition
    {
        CLEAN,DIRTY;
    }


    @Override
    public String toString() {
        return "CarChassis{" +
                "shell=" + shell +
                ", wheel=" + wheel +
                ", color='" + color + '\'' +
                ", con=" + con +
                '}';
    }
}
