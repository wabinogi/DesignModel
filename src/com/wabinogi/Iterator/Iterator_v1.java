package com.wabinogi.Iterator;
//迭代器实现DEMO
//为简单起见，Arraylist和Linedlist不定义Aggregate接口了，因为不一样无法抽象到一起！
//参考JDK，定义Iteraror接口，实现MyIterator类
//可能有小BUG。
import java.util.LinkedList;

public class Iterator_v1 {

    public static void main(String[] args) {
        System.out.println("------------------ArrayList -------------- ");
        MyArrayList<String> array = new MyArrayList<String>(10);
        array.Add("A",0);
        array.Add("B",1);
        array.Add("C",2);
        array.Add("D",3);
        array.Add("E",4);
        array.Add("F",5);
        array.Delete(0);
        array.Delete(5);

        //自制迭代器,数组
        Iterator it = array.iterator;
        while (it.hasNext())
        {
            System.out.println(it.Next());
        }


        System.out.println("------------------LinkedList -------------- ");

        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.Add("W");
        linkedList.Add("A");
        linkedList.Add("B");
        linkedList.Add("I");
        linkedList.Add("N");
        linkedList.Delete();
        linkedList.Delete();
        linkedList.Delete();
        linkedList.Add("N");
        linkedList.Add("G");

        //自制迭代器，链表
        Iterator it1 = linkedList.iterator;
        while (it1.hasNext())
        {
            System.out.println(it1.Next());
        }
        System.out.println(linkedList.Size());
    }
}
