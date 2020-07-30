package com.wabinogi.State;

public class Light {

    private String light;

    public Light(String light)
    {
        this.light = light;
    }

    public void ShowTrafficLight()
    {
        if(this.light.equals("RED"))
        {
            System.out.println("RED light is on !");
            SwitchLight("R-G");
        }
        else if(this.light.equals("GREEN"))
        {
            System.out.println("GREEN light is on !");
            SwitchLight("G-R");
        }
        else if(this.light.equals("G-R"))
        {
            System.out.println("YELLOW light is on !");
            SwitchLight("RED");
        }
        else if(this.light.equals("R-G"))
        {
            System.out.println("YELLOW light is on !");
            SwitchLight("GREEN");
        }
    }

    private void SwitchLight(String light)
    {
        this.light = light;
    }
}
