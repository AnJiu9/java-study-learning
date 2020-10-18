package com.j.datastructure.operation;

import com.j.datastructure.seq.SeqList;

/**
 * @ClassName SeqStack
 * @Description TODO
 * @Author orange
 * @Date 18.10.20
 **/

public final class SeqStack<T> implements Stack<T> {
    private SeqList<T> list;

    public  SeqStack(int length){
        this.list = new SeqList<T>(length);
    }

    public SeqStack(){
        this(64);
    }

    @Override
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    @Override
    public void push(T x){
        this.list.insert(x);
    }

    @Override
    public  T peek(){
        return this.list.get(list.size()-1);
    }

    @Override
    public T pop(){
        return list.remove(list.size()-1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
