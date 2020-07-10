package com.wabinogi.ResChain_v2;

//车外壳实体类
public class CarShell {
    public String from = "China";
    public String type = "default";

    public CarShell(){}
    public CarShell(String from, String type) {
        this.from = from;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarShell{" +
                "from='" + from + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
