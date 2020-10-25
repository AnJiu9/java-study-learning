package com.j.java.week7;

import javax.swing.*;
import java.text.Format;
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
//    public static String format(LocalDate date) {
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        return sdf.format(date);
//
//        return String.valueOf(date.getYear()+"-"+date.getMonthValue()+"-"+date.getDayOfMonth());
//    }
//
//    public static void main(String[] args) {
////        LocalDateTime now = LocalDateTime.now();
////        System.out.println(now);
//
////        System.out.println(LocalDateTime.now());
////        System.out.println(new Date());
//
//        System.out.println(format(LocalDate.now()));
//    }

    /**
     * Date对象 时间格式化
     * Double 数据格式化
     * @param date
     * @return
     */
    public synchronized static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
