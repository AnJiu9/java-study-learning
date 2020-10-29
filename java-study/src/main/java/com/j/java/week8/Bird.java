package com.j.java.week8;

/**
 * @ClassName Bird
 * @Description
 * @Author orange
 * @Date 2020-10-29 11:11
 **/

public class Bird implements Fly {

    @Override
    public void fly(String name, int speed) {
        System.out.println(Fly.NAME + "," + Fly.SPEED);
        System.out.println(name + "飞行，时速：" + speed);
    }
}
