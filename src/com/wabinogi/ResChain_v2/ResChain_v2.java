package com.wabinogi.ResChain_v2;

//实现责任链模式
//场景：模拟汽车生产流水线，包括的功能责任有：加轮胎、加外壳、喷漆、清洗
//责任链特性包括：
//1.每个责任可以指定开启或关闭
//2.单个责任可以加入到链中
//3.链和链也可以连接形成一个完整的链

public class ResChain_v2 {
    public static void main(String[] args) {
        //出厂一个底盘，未装配状态
        CarChassis myCar = new CarChassis();
        //打印未组装情况下的汽车，只有底盘
        System.out.println(myCar);

        //定义生产链
        ProductChain chain = new ProductChain();
        //包括 装外壳
        chain.addAssembleProcess(new AssembleShell(new CarShell("Japan","Close")),true)
                //装轮子
                .addAssembleProcess(new AssembleWheel(new CarWheel("Toyota",300)),true)
                //喷漆
                .addWateringProcess(new PaintColor("Red"),true)
                //洗车
                .addWateringProcess(new CleanCar(),true);

        //按生产链生产一辆车，并打印
        chain.Product(myCar);
        System.out.println(myCar);

        //再来一辆新车，对生产链进行测试
        CarChassis yourCar = new CarChassis();
        ProductChain mainChain = new ProductChain();  //主生产链
        ProductChain asssembleChain = new ProductChain();// 组装生产链：装轮子、装外壳
        ProductChain wateringChain = new ProductChain(); // 水化作业生产链：喷漆、洗车
        //组装生产链
        asssembleChain.addAssembleProcess(new AssembleShell(new CarShell("Audi","Open")),true)
                .addAssembleProcess(new AssembleWheel(new CarWheel("Germany",500)),false);
        //水化作业生产链
        wateringChain.addWateringProcess(new PaintColor("Black"),true)
                .addWateringProcess(new CleanCar(),false);

        //两条生产链加入主生产链
        mainChain.addAssembleProcess(asssembleChain,true)
                .addWateringProcess(wateringChain,true);

        //出车
        mainChain.Product(yourCar);
        System.out.println(yourCar);
    }
}
