package com.j.java.week7;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName 格式化工具类
 * @Description TODO
 * @Author orange
 * @Date 22.10.20
 **/

public class FormatUtil {
    public String format(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        return sdf.format(date);

        String result = String.valueOf(date.getYear());
        return result;
    }

    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

        System.out.println(LocalDateTime.now());
        System.out.println(new Date());
    }
}
