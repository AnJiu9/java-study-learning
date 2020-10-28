package com.j.java.week7;

/**
 * @ClassName PointTest
 * @Description
 * @Author orange
 * @Date 2020-10-28 14:39
 **/

public class PointTest {
    public static void main(String[] args) {
//        Point point = new Point(3,4);
//        System.out.println(point);
//        point.print();

        Circle circle = new Circle(10, 10, 5);
        circle.print();

        Point point1 = new Point(3, 4);
        Point point2 = new Point(8, 10);
        System.out.print("两点之间的距离：");
        System.out.println(FormatUtil.format(point1.getDistance(point2)));

        Point p0 = new Point(0, 0);
        Circle c0 = new Circle(p0, 5);
        Point point3 = new Point(3, 4);
        c0.isInCircle(point3);

        Cylinder cylinder = new Cylinder(2,2,5,6);
        cylinder.print();
    }
}
