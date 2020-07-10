package com.wabinogi.ResChain;


import java.util.LinkedList;
import java.util.List;

//责任链实现
//为了能够多链条 对接，需要继承FilterMother
public class FilterChain extends FilterMother
{
    List<FilterMother> chain = new LinkedList<FilterMother>();

    public FilterChain addFilter(FilterMother fm)
    {
        chain.add(fm);
        return this;
    }

    @Override
    public void wash(String str)
    {
        for(FilterMother fm :chain)
        {
            fm.wash(str);
        }
    }
}


