package com.wabinogi.Iterator;

import sun.jvm.hotspot.debugger.ThreadAccess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IteraterErrorDEMO {


    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
/*
        new Thread(
                ()->{
                    for(int i =0; i <=100; i++)
                    {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        list.add("D");
                    }
                }
        ).start();*/

        Iterator it = list.iterator();
        while (it.hasNext())
        {
           list.add("5");
           list.remove(4);
            System.out.println(it.next());
        }



    }


}
