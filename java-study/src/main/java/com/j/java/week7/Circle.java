package com.j.java.week7;

import javax.sound.midi.Soundbank;

/**
 * @ClassName Circle
 * @Description
 * @Author orange
 * @Date 2020-10-28 14:42
 **/

public class Circle extends Point {
    private int radius;
    Point p0;
    public Circle() {
        //调用父类的构造方法
        super();
        System.out.println("Circle被初始化");
    }

    public Circle(int x, int y, int r) {
        //调用父类的构造方法
        super(x, y);
        this.radius = r;
    }

    public Circle(Point p,int radius) {
        p0=p;
        this.radius= radius;
    }

    @Override
    public void print() {
        //调用父类的成员方法
        super.print();
        double s = Math.PI * radius * radius;
        System.out.println(FormatUtil.format(s));
    }

    public boolean isInCircle(Point p) {
        if((p0.x-p.x)*(p0.x-p.x)+(p0.y-p.y)*(p0.y-p.y)>radius*radius) {
            System.out.println("点不在圆内");
            return false;
        }
        else {
            System.out.println("点在圆内");
        }
        return true;
    }
}
