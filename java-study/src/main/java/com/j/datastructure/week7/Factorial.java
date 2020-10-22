package com.j.datastructure.week7;

/**
 * @ClassName factorial
 * @Description TODO
 * @Author orange
 * @Date 20.10.20
 **/

public class Factorial {
    public static void line(int i){
        System.out.print(String.format("%3d",i));
            if(i < 10){
                line(i + 1);
            }
        System.out.print(String.format("%3d", i));
    }

    public static void main(String[] args) {
        Factorial.line(1);
    }
}
