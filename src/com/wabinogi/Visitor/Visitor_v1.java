package com.wabinogi.Visitor;

import com.wabinogi.Visitor.Pet.Cat;
import com.wabinogi.Visitor.Pet.CatList;
import com.wabinogi.Visitor.Pet.PetVisitor;
import com.wabinogi.Visitor.Pet.Visitable;
//访问者DEMO
//角色：抽象被访问类、抽象访问类
//角色：具体被访问类CAT、具体访问类PetVisitor
//角色：被访问容器 CATLIST
public class Visitor_v1 {

    public static void main(String[] args) {
        //单一对象visit
        Visitable visitor = new PetVisitor();
        Cat cat = new Cat("Mimi","Fish");
        cat.AcceptAndDoVisit(visitor);

        //对LIST进行访问
        CatList list = new CatList();
        list.AddCat(new Cat("Black","mouse"));
        list.AddCat(new Cat("White","water"));
        list.AddCat(new Cat("Kitty","milk"));
        list.VisitAndDoAccept(visitor);
    }
}
