package com.j.datastructure.seq;

import sun.net.idn.Punycode;

import java.security.PublicKey;

/**
 * @ClassName SeqStack
 * @Description TODO
 * @Author orange
 * @Date 13.10.20
 **/

public final class SeqStack<T extends Comparable>  {
    private  SeqList<T> list;

    public  SeqStack(int length){
        this.list = new SeqList<T>(length);
    }

    public SeqStack(){
        this(64);
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    public void push(T x){
        this.list.insert(x);
    }

    public  T peek(){
        return this.list.get(list.size()-1);
    }

    public T pop(){
        return list.remove(list.size()-1);
    }


}
