package com.wabinogi.ResChain;

//字母A过滤器，str中遇到A则将其删除
public class FilterA extends FilterMother{
    @Override
    public void wash(String str) {
        ResChain_v1.setRawString(str.replaceAll("A"," "));
    }
}
