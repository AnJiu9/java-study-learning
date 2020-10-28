package com.j.java.week7;

/**
 * @ClassName Cylinder
 * @Description
 * @Author orange
 * @Date 2020-10-28 16:20
 **/

public class Cylinder extends Point {
    private int radius;
    private int high;

    public Cylinder() {
    }

    public Cylinder(int x, int y, int r, int h) {
        super(x, y);
        this.radius = r;
        this.high = h;
    }

    @Override
    public void print() {
        super.print();
        double s = Math.PI * radius * radius;
        double v = (s * high) / 3;
        System.out.println("圆柱的底面积：" + FormatUtil.format(s) + "圆柱的体积：" + FormatUtil.format(v));
    }
}
