package com.wabinogi.ResChain;

//数字过滤器，str中遇到数字则将其删除
public class FilterNO extends FilterMother
{
    @Override
    public void wash(String str) {
        ResChain_v1.setRawString(str.replaceAll(".[1-9]",""));
    }
}
