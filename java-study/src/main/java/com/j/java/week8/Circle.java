package com.j.java.week8;

import java.sql.SQLOutput;

/**
 * @ClassName Circle
 * @Description 圆形
 * @Author orange
 * @Date 2020-10-29 08:26
 **/

public class Circle extends BaseShape{
    private final Integer r;

    public Circle(Integer r){
        //调用父类的构造方法
        super();
        System.out.println("子类初始化");
        this.r = r;
    }
    @Override
    public void getName() {
        super.getName();
        System.out.println("This is a Circle class.");
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    public void printArea(){
        System.out.println(this.getArea());
    }
}
