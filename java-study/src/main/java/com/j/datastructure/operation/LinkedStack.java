package com.j.datastructure.operation;

import com.j.datastructure.linkedlist.SinglyList;
import sun.net.idn.Punycode;

import java.security.PublicKey;

/**
 * @ClassName LinkedStack
 * @Description TODO
 * @Author orange
 * @Date 18.10.20
 **/

public final class LinkedStack<T extends Comparable> implements Stack<T>{

    private SinglyList<T> list;

    public LinkedStack(){
        this.list = new SinglyList<T>();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(T x) {
        this.list.insert(0,x);
    }

    @Override
    public T peek() {
        return this.list.get(0);
    }

    @Override
    public T pop() {
        return this.list.remove(0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
