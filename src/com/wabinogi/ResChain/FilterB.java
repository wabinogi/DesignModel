package com.wabinogi.ResChain;

//字母B过滤器，str中遇到B则将其删除
public class FilterB extends FilterMother
{
    @Override
    public void wash(String str) {
        ResChain_v1.setRawString(str.replaceAll("B"," "));
    }
}
