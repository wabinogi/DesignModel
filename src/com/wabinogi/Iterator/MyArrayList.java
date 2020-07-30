package com.wabinogi.Iterator;

//自定义数组结构
public class MyArrayList<T>  {

    private Object[] array;
    private int size;
    int count;
    public Iterator iterator = new ArrayIterator();

    public MyArrayList(int count)
    {
        if(count < 0) return;
        this.count = count;
        this.array = new Object[count];
        this.size = 0;
    }


    public void Add(T t,int index) {
        if(size + 1 > count) return;
        if(this.get(index) == null) size = size + 1 ;
        array[index] = t;
    }


    public void Delete(int index) {
        array[index] = null;
        size = size - 1;
    }

    T get(int index)
    {
        return (T)array[index];
    }

    public int Size() {
        return this.size;
    }

    private class ArrayIterator implements Iterator{

        private int indicator = 0;

        @Override
        public boolean hasNext() {
            if(indicator > array.length - 1 ) return false;
            else return true;
        }

        @Override
        public Object Next() {

            T t = (T)array[indicator];
            indicator = indicator + 1;
            return t;
        }
    }

}
