package com.j.java.week6.exercises;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author orange
 * @Date 18.10.20
 **/

class AAA {
    static int m;
    static {
        m = 888;
    }
}

public class E{
    public static void main(String[] args) {
        AAA a = null;
        System.out.printf("%d:%d", AAA.m, a.m);
    }
}
