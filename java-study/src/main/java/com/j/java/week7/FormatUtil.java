package com.j.java.week7;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName 格式化工具类
 * @Description TODO
 * @Author orange
 * @Date 22.10.20
 **/

public class FormatUtil {
    public static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
