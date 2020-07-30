package com.wabinogi.Visitor.Pet;

import java.util.ArrayList;
import java.util.List;

public class CatList {

    List<Cat> catList = new ArrayList<Cat>();

    public void AddCat(Cat cat){
        catList.add(cat);
    }

    public void VisitAndDoAccept(Visitable visitor)
    {
        for(int i =0; i <catList.size(); i++){
            System.out.println("--------Catch a Cat from List ---------");
            catList.get(i).AcceptAndDoVisit(visitor);
        }
    }
}
