package com.j.datastructure.binarytree;

import sun.jvm.hotspot.runtime.VMReg;

/**
 * @ClassName BinaryTree
 * @Description
 * @Author orange
 * @Date 2020-11-03 14:23
 **/

public class BinaryTree<T> {
    public BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(T[] prelist) {
        this.root = creat(prelist);
    }

    private int i = 0;

    private BinaryNode<T> creat(T[] prelist) {
        BinaryNode<T> p = null;
        if (i < prelist.length) {
            T elem = prelist[i++];
            if (elem != null) {
                p = new BinaryNode<T>(elem);
                p.left = creat(prelist);
                p.right = creat(prelist);
            }
        }
        return p;
    }

    public void preorder() {
        preorder(this.root);
        System.out.println();
    }

    public void preorder(BinaryNode<T> p) {
        if (p != null) {
            System.out.print(p.data.toString() + " ");
            preorder(p.left);
            preorder(p.right);
        }
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    public void inorder(BinaryNode<T> p) {
        if (p != null) {
            inorder(p.left);
            System.out.print(p.data.toString() + " ");
            inorder(p.right);
        }
    }

    public void postorder() {
        postorder(this.root);
        System.out.println();
    }

    public void postorder(BinaryNode<T> p) {
        if (p != null) {
            postorder(p.left);
            postorder(p.right);
            System.out.print(p.data.toString() + " ");
        }
    }

    private int n = 0;

    public void size() {
        size(this.root);
        System.out.println(n);
    }

    public int size(BinaryNode<T> p) {
        if (p != null) {
            n++;
            size(p.left);
            size(p.right);
        }
        return -1;
    }

    private int s = 0;

    public void size2() {
        size2(this.root);
        System.out.println(s);
    }

    public int size2(BinaryNode<T> p) {
        if (p != null) {
            if (p.left == null && p.right == null) {
                s++;
            }
            size2(p.left);
            size2(p.right);
        }
        return -1;
    }


    public static void main(String[] args) {
        String[] prelist = {"A", "B", "D", null, null, null, "C", "E", null, null, "F", "H" };
        BinaryTree<String> bitree = new BinaryTree<String>(prelist);
        System.out.print("先根：");
        bitree.preorder();
        System.out.print("中根：");
        bitree.inorder();
        System.out.print("后根：");
        bitree.postorder();
        System.out.print("结点总数：");
        bitree.size();
        System.out.print("叶子结点：");
        bitree.size2();
    }

}
