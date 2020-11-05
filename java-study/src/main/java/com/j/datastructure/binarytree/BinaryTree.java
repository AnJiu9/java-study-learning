package com.j.datastructure.binarytree;

import sun.jvm.hotspot.runtime.VMReg;
import sun.net.idn.Punycode;

/**
 * @ClassName BinaryTree
 * @Description
 * @Author orange
 * @Date 2020-11-03 14:23
 **/

public class BinaryTree<T extends Comparable>  {
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

    private int leafNodeCount = 0;

    public void countLeaf() {
        countLeaf(this.root);
        System.out.println(leafNodeCount);
    }

    public int countLeaf(BinaryNode<T> p) {
        if (p != null) {
            if (p.isLeaf()) {
                leafNodeCount++;
            }
            countLeaf(p.left);
            countLeaf(p.right);
        }
        return -1;
    }

    public int height() {
        return height(this.root);
    }

    public int height(BinaryNode<T> p) {
        if (p == null) {
            return 0;
        }
//        int lh = height(p.left);
//        int rh = height(p.right);
//        return (lh >= rh) ? lh + 1 : rh + 1;
        return Math.max(height(p.left), height(p.right)) + 1;
    }

    public void insert(T x) {
        if (x != null) {
            this.root = new BinaryNode<T>(x, this.root, null);
        }
    }

    public BinaryNode<T> insert(BinaryNode<T> p, boolean left, T x) {
        if (x == null || p == null) {
            return null;
        }
        if (left) {
            return p.left = new BinaryNode<T>(x, p.left, null);
        }
        return p.right = new BinaryNode<T>(x, null, p.right);
    }

    public BinaryNode<T> search(T key) {
        BinaryNode<T> current = this.root;
        while (current != null) {
            if (key.compareTo(current.data) < 0) {
                current = current.left;
            } else if (key.compareTo(current.data) > 0) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] prelist = {"A", "B", "D", null, null, null, "C", "E", null, null, "F", "H"};
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
        bitree.countLeaf();
        System.out.print("二叉树高度：");
        System.out.println(bitree.height());
        System.out.print("插入根结点：");
        bitree.insert("I");
        bitree.preorder();
        System.out.print("插入X结点作为左孩子：");
        bitree.insert(bitree.root.left, true, "X");
        bitree.preorder();
        System.out.print("查找参数key：");
        System.out.println(bitree.search("A"));
    }

}
