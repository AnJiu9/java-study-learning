package com.j.java.week7;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.bcel.internal.generic.POP;

/**
 * @ClassName Point
 * @Description
 * @Author orange
 * @Date 2020-10-28 14:35
 **/

public class Point {
     int x;
     int y;

    public Point() {
        System.out.println("Point被初始化");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double getDistance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

}
