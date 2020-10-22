package com.j.java.week7;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Date;

/**
 * @ClassName 重载练习
 * @Description TODO
 * @Author orange
 * @Date 22.10.20
 **/

public class OverLoadTest {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum(String s1, String s2, String s3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        stringBuilder.append(s2);
        stringBuilder.append(s3);
        return stringBuilder.toString();
    }

    public static String sum(String d1, String d2) {
        Integer t1 = Integer.parseInt((d1));
        Integer t2 = Integer.parseInt((d2));
        String s = null;
        int time = t1 + t2;
        if (time < 60) {
            s=time + "s";
        } else if (time >= 60) {
            s = time / 60 + "m" + time % 60 + "s";
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(OverLoadTest.sum("10", "20"));
        System.out.println(OverLoadTest.sum("60", "20"));

    }
}
