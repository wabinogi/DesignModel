package com.wabinogi.Builder;

//建造者DEMO
public class Computer
{
    private static Computer BuilderMother = new Computer();
    private String cpu = "default";
    private String ram = "default";
    private String display = "default";
    private String keyboard = "default";
    private String mouse = "default";
    //外部不可实例化，只能通过Builder接口建造
    private Computer(){}

    //建造接口
    //使用BuilderMother初始化一个静态ComputerBuilder
    public static Builder Builder()
    {
        return BuilderMother.new ComputerBuilder();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", display='" + display + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    //建造者放在内部类中比较合适
    private class ComputerBuilder implements Builder
    {
        private Computer computer = new Computer();

        @Override
        public Builder setCpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        @Override
        public Builder setRam(String ram) {
            computer.ram = ram;
            return this;
        }

        @Override
        public Builder setDisplay(String display) {
            computer.display = display;
            return this;
        }

        @Override
        public Builder setKeyboard(String keyboard) {
            computer.keyboard = keyboard;
            return this;
        }

        @Override
        public Builder setMouse(String mouse) {
            computer.mouse = mouse;
            return this;
        }

        @Override
        public Computer GetComputer() {
            return computer;
        }
    }
}
