package com.j.java.week8;

/**
 * @ClassName Plane
 * @Description
 * @Author orange
 * @Date 2020-10-29 11:12
 **/

public class Plane implements Fly {
    @Override
    public void fly(String name, int speed) {
        System.out.println(name + "飞行，时速：" + speed);
    }
}
