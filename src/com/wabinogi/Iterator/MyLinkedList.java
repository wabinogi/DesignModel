package com.wabinogi.Iterator;

import javax.xml.soap.Node;

//自定义双向链表结构
public class MyLinkedList<T> {

    private int size;
    private Node first;
    private Node last;
    private Node pre;
    private Node next;
    public Iterator iterator = new LinkedIterator();
    public MyLinkedList()
    {
        this.size = 0;
    }

    //尾巴加一个
    public void Add(T t)
    {
        if(this.size == 0) {
            this.first = this.last = new Node(t);
        }
        else {
            Node newNode = new Node(t);
            newNode.pre = this.last;
            newNode.next = null;
            this.last.next = newNode;
            this.last = newNode;
        }
        this.size = this.size + 1;
    }

    //尾巴减一个
    public void Delete()
    {
        if(this.size == 0) return;
        if(this.size == 1)
        {
            this.first = this.last = null;
        }
        else {
            Node oldtail = this.last;
            this.last = oldtail.pre;
            oldtail.next = null;
            oldtail.pre = null;
        }
        this.size = this.size - 1;
    }

    public int Size()
    {
        return  this.size;
    }

    //链表中的原子结构
    class Node<T>{
        Node pre; //前指针
        Node next; //后指针
        T t;

        Node(T concrete_t)
        {
            this.t = concrete_t;
        }
    }

    private class LinkedIterator implements Iterator{

        private int indicator = 0;
        private Node current;

        @Override
        public boolean hasNext() {
            if(indicator > size - 1 ) return false;
            else return true;
        }

        @Override
        public Object Next() {
            if(indicator == 0)
            {
                current = first;
            }
            else {
                current = current.next;
            }
            indicator = indicator + 1;
            return current.t;
        }
    }

}
