package com.j.datastructure.HuffmanTree;

/**
 * @ClassName TriElement
 * @Description
 * @Author orange
 * @Date 2020-11-12 16:18
 **/

public class TriElement {
    int data;
    int parent, left, right;

    public TriElement(int data, int parent, int left, int right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public TriElement(int data) {
        this(data,-1,-1,-1);
    }

    public boolean isLeaf() {
        if (this.left == -1 && this.right == -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TriElement{" +
                "data=" + data +
                ",parent=" + parent +
                ",left=" + left +
                ",right=" + right +
                "}";
    }
}
