package com.wabinogi.Builder;

public class Builder_v1 {

    public static void main(String[] args) {
        Computer myComputer = Computer.Builder().setCpu("AMD")
                .setDisplay("AOC")
                .setRam("16G")
                .setMouse("Logitech")
                .setKeyboard("ICBK")
                .GetComputer();

        Computer myComputer1 = Computer.Builder().setDisplay("DELL").GetComputer();

        System.out.println(myComputer);
        System.out.println(myComputer1);

    }
}
