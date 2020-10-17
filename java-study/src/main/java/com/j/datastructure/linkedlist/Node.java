package com.j.datastructure.linkedlist;

/**
 * @ClassName Node
 * @Description TODO
 * @Author orange
 * @Date 13.10.20
 **/

public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    public Node(){
        this(null,null);
    }

    @Override
    public String toString(){
        return this.data.toString();
    }

}


