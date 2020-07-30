package com.wabinogi.ResChain;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.FilterInputStream;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Filter;

//责任链
//1.责任链实现
//2.多责任链间可连接
//单个责任链处理后的返回结果通过SET方法设置回去
public class ResChain_v1 {
    //待处理字符串
    static String rawString = "1111AAAAcBBBB222-s";
    public static String getRawString() {
        return rawString;
    }

    //各职责链处理器和待处理字符串间的接口
    public static void setRawString(String rawString) {
        ResChain_v1.rawString = rawString;
    }

    public static void main(String[] args) {

        //主责任链
        FilterChain filters = new FilterChain();
        //字符处理责任链
        FilterChain Charfilter = new FilterChain();
        //数字处理责任链
        FilterChain NumberFilter = new FilterChain();

        Charfilter.addFilter(new FilterA())
                  .addFilter(new FilterB());
        NumberFilter.addFilter(new FilterNO());

        filters.addFilter(Charfilter)
                .addFilter(NumberFilter);

        //责任链开始处理
        filters.wash(rawString);
        System.out.println(rawString);


    }

}
