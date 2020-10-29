package com.j.java.week8;

/**
 * @ClassName Shape
 * @Description 形状抽象类
 * @Author orange
 * @Date 2020-10-29 08:14
 **/

public abstract class BaseShape {
    /**
     * abstract 抽象类中可以声明成员变量，可以有静态属性
     */
    private static String name;

    /**
     * abstract 抽象类中可以没有抽象方法
     */
    public void print() {
        System.out.println("This is an abstract class.");
    }

    /**
     * abstract 抽象类中可以有构造方法
     */
    public BaseShape() {
        System.out.println("父类初始化");
    }

    /**
     * 求面积
     * 抽象类中的抽象方法不能被声明为static
     * @return double
     */
    public abstract double getArea();

    /**
     * abstract 抽象类中可以有静态方法
     */
    public  void getName() {
        System.out.println("This is an abstract class.");
    }
}
