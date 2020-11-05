package com.j.datastructure.binarytree;

import javax.swing.*;

/**
 * @ClassName BinaryNode
 * @Description
 * @Author orange
 * @Date 2020-11-03 14:19
 **/

public class BinaryNode<T> {
    public T data;
    public BinaryNode<T> left, right;

    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}


