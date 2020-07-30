package com.wabinogi.Builder;

//建造接口
public interface Builder {
    Builder setCpu(String cpu);
    Builder setRam(String ram);
    Builder setDisplay(String display);
    Builder setKeyboard(String keyboard);
    Builder setMouse(String mouse);
    Computer GetComputer();
}
